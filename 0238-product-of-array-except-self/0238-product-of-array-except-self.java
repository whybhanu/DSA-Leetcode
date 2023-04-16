class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int countOfZeroes = 0;
        int indexOfZero = -1;
        int productWithoutZero = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countOfZeroes++;
                indexOfZero = i;
            } else {
                productWithoutZero *= nums[i];
            }
        }

        if(countOfZeroes == 0){
            for(int j = 0; j < nums.length; j++){
                ans[j] = productWithoutZero / nums[j];
            }
        } else if (countOfZeroes == 1){
            for(int j = 0; j < nums.length; j++){
                ans[indexOfZero] = productWithoutZero;
            }
        }
        return ans;
    }
}