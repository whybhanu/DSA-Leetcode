class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num + "";
        int count = 0;
        for(int i = 0; i < s.length() - k + 1; i++){
            String temp = s.substring(i,i+k);    // storing string till window length
            int n1 = Integer.valueOf(temp);       // converting string to integer
            if(n1==0){
                continue;
            }
            if(num%n1==0){
                count++;
            }
        }
        return count;
    }
}