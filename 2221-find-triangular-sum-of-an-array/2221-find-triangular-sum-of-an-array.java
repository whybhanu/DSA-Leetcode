class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int[] arr = new int[nums.length - 1];
        int firstPoint = 0; 
        for(int i = 1; i < nums.length; i++){
            arr[firstPoint] = (nums[i] + nums[firstPoint])%10;
            firstPoint++;
        }
        return triangularSum(arr);
    }
}