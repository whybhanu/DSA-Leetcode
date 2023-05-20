class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int max = 0;
        while(start < end){
            max = Math.max(nums[start++] + nums[end--], max);
        }
        return max;
    }
}