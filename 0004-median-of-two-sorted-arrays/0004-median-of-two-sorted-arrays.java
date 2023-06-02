class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int[] nums = new int[nums1.length + nums2.length];
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            nums[count++] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            nums[count++] = nums2[i];
        }
        Arrays.sort(nums);
        if(nums.length % 2 == 0){
            double a = nums[nums.length/2];
            double b = nums[nums.length/2 - 1];
            ans = (a + b)/2;
            return ans;
        } else {
            return nums[nums.length/2];
        }
    }
}