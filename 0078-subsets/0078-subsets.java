class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(arr, 0, list, result);
        return result;
    }

    void helper(int[] nums, int start, List<Integer> list, List<List<Integer>> ans){
        if (start >= nums.length) {
            ans.add(new ArrayList<>(list));
        } else {
            // add the element and start the  recursive call
            list.add(nums[start]);
            helper(nums, start + 1, list, ans);
            // remove the element and do the backtracking call.
            list.remove(list.size() - 1);
            helper(nums, start + 1, list, ans);
        }
    }
}