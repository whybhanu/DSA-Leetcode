class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        if(nums.length < 3){
            for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            return list;
        }
        int n = nums.length/3;

        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                count = 1;
            } else {
                count++;
            }
            if(count > n){
                set.add(nums[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}