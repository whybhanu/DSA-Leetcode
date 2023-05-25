class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] arr = new long[nums.length];
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            arr[i] = sum;
        }
        long count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(arr[i] >= arr[nums.length - 1] - arr[i]){
                count++;
            }
        }
        return (int)(count);
    }
}