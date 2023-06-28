class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans = pq.poll();
        }
        return ans;
    }
}

/*
[3, 2, 1, 5, 6, 4], k = 2 output: 5
[1, 2, 3, 4, 5, 6]

[3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4 output: 4
[1, 2, 2, 3, 3, 4, 5, 5, 6]

*/