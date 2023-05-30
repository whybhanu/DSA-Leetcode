class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(indices[i],s.charAt(i));
        }
        String k = "";
        for(int i = 0; i < s.length(); i++){
            k = k + map.get(i);
        }
        return k;
    }
}