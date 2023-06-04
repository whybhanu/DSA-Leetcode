class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length/2 + 1;

        int count = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                count = 1;
            } else {
                count++;
            }
            if(count == n) return nums[i];
        }
        return 0;
    }
}