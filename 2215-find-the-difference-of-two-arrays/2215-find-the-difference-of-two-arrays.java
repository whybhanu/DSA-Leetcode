class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();        
        
        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        for (int n : set1){
            if(set2.contains(n) == false){
                arr1.add(n);
            }
        }
        for (int n : set2){
            if(set1.contains(n) == false){
                arr2.add(n);
            }
        }
        result.add(arr1);
        result.add(arr2);
        return result;
    }
}