class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int low = 0, high = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(Math.abs(nums[low]) >= Math.abs(nums[high])) {
                arr[i] = nums[low]*nums[low];
                low++;
            }
            else {
                arr[i] = nums[high]*nums[high];
                high--;
            }
        }
        return arr;
    }
}