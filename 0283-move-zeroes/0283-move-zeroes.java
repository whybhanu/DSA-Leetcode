class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                result[start] = nums[i];
                start++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            nums[j] = result[j];
        }
    }
}