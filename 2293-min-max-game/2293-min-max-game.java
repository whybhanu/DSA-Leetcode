class Solution {
    public int minMaxGame(int[] nums) {
        // base case of recursion
        if(nums.length == 1){
            return nums[0];
        }
        int[] arr = new int[nums.length/2];
        int first = 0;
        int second = 1;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(count%2 == 0){
                arr[i] = Math.min(nums[first], nums[second]);
            } else {
                arr[i] = Math.max(nums[first], nums[second]);
            }
            count++;
            first = second + 1;
            second = first + 1;
        }
        return minMaxGame(arr);
    }
}