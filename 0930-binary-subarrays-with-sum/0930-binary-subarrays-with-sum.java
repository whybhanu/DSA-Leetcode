class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0, right = 0;
        int count = 0;
        int result = 0;

        while(left < nums.length && right < nums.length){
            count += nums[right];
            if(count < goal){
                right++;
            } else if (count > goal){
                left++;
                right = left;
                count = 0;
            } else {
                result++;
                right++;
                if(right == nums.length){
                    left++;
                    right = left;
                    count = 0;
                }
            }
        }
        return result;
    }
}