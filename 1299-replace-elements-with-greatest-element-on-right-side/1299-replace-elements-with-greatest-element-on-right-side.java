class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int[] nums = new int[arr.length];
        nums[arr.length - 1] = -1;

        for(int i = 0; i < arr.length - 1; i++){
            int max = findMax(arr, i + 1);
            nums[i] = max;
        }
        return nums;
    }

    int findMax(int[] arr, int start){
        int max = -1;
        for(int i = start; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}