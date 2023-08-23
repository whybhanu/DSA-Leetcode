class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char letter = 'a';
        for(int i = 0; i < key.length(); i++){
            if(!map.containsKey(key.charAt(i)) && key.charAt(i) != ' '){
                map.put(key.charAt(i), letter);
                letter = (char)(letter + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' ') sb.append(' ');
            else sb.append(map.get(message.charAt(i)));
        }
        return sb.toString();
    }
}

