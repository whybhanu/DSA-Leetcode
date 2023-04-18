class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        String x = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == ""){
                continue;
            }
            if(i > 0){
                x = x + arr[i] + " ";
            } else {
                x = x + arr[i];
            }
        }
        return x;
    }
}