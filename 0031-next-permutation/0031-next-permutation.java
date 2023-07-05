class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = indexOfLastPeak(nums) - 1;
        if(pivot != -1){
            int nextPrefix = lastIndexOfGreater(nums, nums[pivot]);
            swap(nums, pivot, nextPrefix);
        }
        reverse(nums, pivot + 1);
    }

    int indexOfLastPeak(int[] nums){
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i - 1] < nums[i]) return i;
        }
        return 0;
    }
    int lastIndexOfGreater(int[] nums, int breakpoint){
        for(int i = nums.length - 1; i >= 0; i--){
            if(breakpoint < nums[i]) return i;
        }
        return -1;
    }
    void reverse(int[] nums, int start){
        int end = nums.length - 1;
        while(start < end) swap(nums, start++, end--);
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}