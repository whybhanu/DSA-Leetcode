class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(charFreq.containsKey(a)) charFreq.put(a, charFreq.get(a) + 1);
            else charFreq.put(a, 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(charFreq.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}