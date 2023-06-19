class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int maxCount = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int[] arr = new int[set.size()];
        int x = 0;
        for(int ele: set){
            arr[x++] = ele;
        }
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != 1) count = 0;
            count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}