//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public void Rearrange(int nums[], int n) {
        int[] pos = new int[n];
        int[] neg = new int[n];
        int countPos = 0;
        int countNeg = 0;
        for(int num : nums){
            if(num < 0){
                neg[countNeg++] = num;
            } else if(num >= 0){
                pos[countPos++] = num;
            }
        }
        int count = 0;
        for(int i = 0; i < countNeg; i++){
            nums[count++] = neg[i];
        }
        for(int i = 0; i < countPos; i++){
            nums[count++] = pos[i];
        }
    }
}