class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
            set.add(nums[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        while(!map.isEmpty()){
            List<Integer> row = new ArrayList<>();
            for(int key : set){
                if(map.containsKey(key)) {
                    int cnt = map.get(key);
                    row.add(key);
                    if(cnt == 1) {
                        map.remove(key);
                    }else{
                        map.put(key, cnt - 1);
                    } 
                }
            }
            list.add(row);
        }
        return list;
    }
}