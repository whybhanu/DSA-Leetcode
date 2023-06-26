class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        for(int stone: stones){
            maxHeap.add(-stone);
        }
        while(maxHeap.size() > 1){
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if(stone1 != stone2) maxHeap.add(stone1 - stone2);
        }
        return maxHeap.size() != 0 ? (-maxHeap.remove()) : 0;
    }
}
// 1 1 2 4 7 8
// 1 1 2 4 1
// 1 1 1 2 4

// 1 1 1 2
// 1 1 1
// 1 1 1

// 1 1 1
// 1
