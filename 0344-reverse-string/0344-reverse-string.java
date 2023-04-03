class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        
    }
}

/*
int start = 0;
        int end = s.length -1;
        for(int i = start; i < end; i++){
            char temp = s[i];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
*/