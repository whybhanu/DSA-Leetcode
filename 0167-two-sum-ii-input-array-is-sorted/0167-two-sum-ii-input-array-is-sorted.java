class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] nums = new int[2];
        while(start <= end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                nums[0] = start + 1;
                nums[1] = end + 1;
                break;
            }
            if(sum > target){
                end--;
            } else{
                start++;
            }
        }
        return nums;
    }
}
