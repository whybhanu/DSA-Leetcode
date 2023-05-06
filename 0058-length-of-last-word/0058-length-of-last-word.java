class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        String k = arr[arr.length - 1];
        return k.length();
    }
}