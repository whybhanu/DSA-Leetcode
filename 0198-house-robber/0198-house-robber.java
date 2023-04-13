class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2) 
            return nums[0];

// creating array to store the maximum element
        int[] maxArr = new int[nums.length];

        maxArr[0] = nums[0];
        maxArr[1] = Math.max(nums[0], nums[1]);

// to complete full array
        for(int i = 2; i < nums.length; i++){
            // core logic
            maxArr[i] = Math.max(maxArr[i - 2] + nums[i], maxArr[i - 1]);
        }

        return maxArr[nums.length-1];
    }
}