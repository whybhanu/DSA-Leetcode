class Solution {
    public Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        helper( nums, list, freq);
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans;
    }

    void helper(int[] nums, List<Integer> list, boolean[] freq){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                helper(nums, list, freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
}