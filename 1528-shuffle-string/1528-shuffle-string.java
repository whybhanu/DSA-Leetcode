class Solution {
    public String restoreString(String s, int[] indices) {
        char[] k = new char[indices.length];
        for(int i = 0; i < k.length; i++){
            k[indices[i]] = s.charAt(i);
        }
        return new String(k);
    }
}