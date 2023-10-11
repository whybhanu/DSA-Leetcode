//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    long maxProduct(int[] arr, int n) {
        long res = arr[0];
        long min = 1;
        long max = 1;
        for(int i : arr){
            long temp = max*i;
            max = Math.max(i, Math.max(temp, min*i));
            min = Math.min(i, Math.min(temp, min*i));
            res = Math.max(res, max);
        }
        return res;
    }
}