class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count++;
            if(nums[i] != 0){
                product = product * nums[i];
            }
        }
        if(count == 0){
            for(int i = 0; i < nums.length; i++){
                arr[i] = product/nums[i];
            }
        } else if(count == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    arr[i] = product;
                }
            }
        }
        return arr;
    }
}