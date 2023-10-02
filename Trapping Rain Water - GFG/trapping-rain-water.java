//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    static long trappingWater(int arr[], int n) { 
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        long res = 0;
        for(int i = 0; i < n; i++){
            res = Math.max(arr[i], res);
            prefix[i] = res;
        }
        res = 0;
        for(int i = n-1; i >= 0; i--){
            res = Math.max(res, arr[i]);
            suffix[i] = res;
        }
        long count = 0;
        for(int i = 0; i < n; i++){
            count += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return count;
        
    } 
}