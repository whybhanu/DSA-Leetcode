class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] nums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[i + nums1.length] = nums2[i];
        }
        Arrays.sort(nums);
        if(nums.length % 2 == 0){
            double a = nums[nums.length/2];
            double b = nums[nums.length/2 - 1];
            median = (a+b)/2;

        } else{
            median = nums[nums.length/2];
        }
        return median;
    }
}