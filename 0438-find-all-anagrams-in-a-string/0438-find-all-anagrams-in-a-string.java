class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int startIndex = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            if(map1.containsKey(p.charAt(i))) map1.put(p.charAt(i), map1.get(p.charAt(i)) + 1);
            else map1.put(p.charAt(i), 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map2.containsKey(s.charAt(i))) map2.put(s.charAt(i), map2.get(s.charAt(i)) + 1);
            else map2.put(s.charAt(i), 1);
            if(i >= p.length() - 1){
                if(map2.equals(map1)) list.add(startIndex);
                if(map2.containsKey(s.charAt(startIndex))){
                    map2.put(s.charAt(startIndex), map2.get(s.charAt(startIndex)) - 1);
                    if(map2.get(s.charAt(startIndex)) == 0) map2.remove(s.charAt(startIndex));
                }
                startIndex++;
            }
        }
        return list;
    }
}