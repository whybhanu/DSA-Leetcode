class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
            if(map.get(nums[i]) > nums.length/3){
                if(!list.contains(nums[i])) list.add(nums[i]);
            }
            if(list.size() == 2) break;
        }
        return list;
    }
}