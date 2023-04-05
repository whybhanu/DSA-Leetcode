class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }
        int x = 0;
        int[] arr = new int[nums.length - count];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                arr[x] = nums[i];
                x++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            nums[i] = arr[i];
        }
        return arr.length;
    }
}