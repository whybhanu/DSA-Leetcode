class Solution {
    public int countHillValley(int[] nums) {
        int hill = 0;
        int count = 1;
        int[] arr = new int[nums.length];
        arr[0]= nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                arr[count++] = nums[i];
            }
        }
        for(int i = 1; i < count-1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                hill++;
            } else if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1]){
                hill++;
            }
        }
        return hill;
    }
}