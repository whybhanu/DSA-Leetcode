//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                for (int j = i + 1; j < arr.length-2; j++) {
                        if (j == i + 1 || arr[j] != arr[j - 1]){
                        int start = j + 1;
                        int end = arr.length - 1;
                        while (start < end) {
                            int sum = arr[start] + arr[end] + arr[i] + arr[j];
                            if (sum == k) {
                                ArrayList<Integer> list = new ArrayList<>();
                                list.add(arr[i]);
                                list.add(arr[j]);
                                list.add(arr[start]);
                                list.add(arr[end]);
                                res.add(list);
                                while (start < end && arr[start] == arr[start + 1]) start++;
                                while (start < end && arr[end] == arr[end - 1]) end--;
                                start++;
                                end--;
                            } else if (sum > k) {
                                end--;
                            } else {
                                start++;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}