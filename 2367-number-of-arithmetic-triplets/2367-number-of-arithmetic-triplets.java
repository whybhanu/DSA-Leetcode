class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) map.put(nums[i], i); 
        for(int i = 0; i < nums.length; i++){
            int prev = nums[i] - diff;
            int next = nums[i] + diff;
            if(map.containsKey(prev) && map.containsKey(next)) count++;
        }
        return count;
    }
}