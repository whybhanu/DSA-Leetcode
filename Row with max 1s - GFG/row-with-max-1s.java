//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxRow = -1;
        int cnt = -1;
        for(int i = 0; i < n; i++){
            int x = findOneIdx(i, arr);
            if(x != -1){
                if(x > cnt){
                    cnt = x;
                    maxRow = i;
                }
            }
        }
        return maxRow;
    }
    static int findOneIdx(int i, int[][] nums) {
        int start = 0;
        int end = nums[0].length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == 0 && nums[i][mid] == 1) return nums[0].length;
            if ((mid + 1 < nums[0].length) && (nums[i][mid] == 0) && (nums[i][mid + 1] == 1)) {
                return (nums[0].length  - (mid + 1));
            } else if (mid - 1 >= 0 && (nums[i][mid - 1] == 0) && (nums[i][mid] == 1)) {
                return ((nums[0].length - 1) - mid + 1);
            } else if (nums[i][mid] > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}