class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(start < end){
            if(nums[start] + nums[end] == target) return new int[]{start, end};
            if(end == nums.length - 1){
                start++;
                end = start + 1;
            } else {
                end++;
            }
        }
        return new int[]{-1, -1};
    }
}