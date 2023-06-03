class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            arr[i] = Math.max(nums[i] + arr[i - 2], arr[i - 1]);
        }
        return Math.max(arr[arr.length - 1], arr[arr.length - 2]);
    }
}