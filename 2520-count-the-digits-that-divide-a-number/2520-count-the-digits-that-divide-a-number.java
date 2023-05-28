class Solution {
    public int countDigits(int num) {
        int count = 0;
        String s = num+"";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int a = ch - '0';
            if(num%a == 0) count++;
        }
        return count;
    }
}