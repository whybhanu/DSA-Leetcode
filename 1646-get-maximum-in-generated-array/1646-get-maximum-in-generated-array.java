class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0){
            return 0;
        } else if(n < 3){
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        int max = -1;
        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                nums[i] = nums[i/2];
            } else {
                nums[i] = nums[i/2 + 1] + nums[i/2];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}