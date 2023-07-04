class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        helper(nums, list, freq);
        return res;
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