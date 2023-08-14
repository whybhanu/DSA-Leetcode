class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i+=2) arr[i] = nums[count++];
        for(int i = 1; i < nums.length; i+=2) arr[i] = nums[count++];
        return arr;
    }
}