class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int newIndex = 1;
        for(int i = 1; i < nums.length; i++){
           if(nums[i-1] == nums[i]){
               count++;
           }
            if(nums[i - 1] < nums[i]){
                count = 1;
            }
           if(count < 3){
               nums[newIndex++] = nums[i];
           }
        }
        return newIndex;
    }
}