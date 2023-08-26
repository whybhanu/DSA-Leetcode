class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            set.add(Integer.parseInt(sb.reverse().toString()));
        }
        return set.size();
    }
}