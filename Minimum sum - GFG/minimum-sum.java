//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// 2 3 4 5 6 8
// 246
// 358
// 

class Solution {
    String solve(int[] arr, int n) {
        Arrays.sort(arr);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) continue;
            if(i%2 == 0) s1 = s1.append(arr[i]);
            else s2 = s2.append(arr[i]);
        }
        if(s1.length() == 0 && s2.length() == 0) return s1.append(0).toString();
        if(s1.length() == 0) return s2.toString();
        if(s2.length() == 0) return s1.toString();
        return addToString(s1, s2);
    }
    static String addToString(StringBuilder s1, StringBuilder s2){
        s1.reverse();
        s2.reverse();
        int p1 = 0;
        int p2 = 0;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(p1 < s1.length() || p2 < s2.length()){
            int n1 = 0;
            int n2 = 0;
            if(p1 < s1.length()) n1 = (s1.charAt(p1++) - '0');
            if(p2 < s2.length()) n2 = (s2.charAt(p2++) - '0');
            int sum = carry + n1 + n2;
            carry = sum/10;
            res.append(sum%10 + "");
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}