//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    public static int[] sortA1ByA2(int arr1[], int N, int arr2[], int M) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        for (int num : arr2) {
            if (frequencyMap.containsKey(num)) {
                int frequency = frequencyMap.get(num);
                for (int i = 0; i < frequency; i++) {
                    result.add(num);
                }
                frequencyMap.remove(num);
            }
        }
        List<Integer> remainingElements = new ArrayList<>();
        for (int num : arr1) {
            if (frequencyMap.containsKey(num)) {
                int frequency = frequencyMap.get(num);
                for (int i = 0; i < frequency; i++) {
                    remainingElements.add(num);
                }
                frequencyMap.remove(num);
            }
        }
        Collections.sort(remainingElements);
        result.addAll(remainingElements);
        int[] sortedArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sortedArr[i] = result.get(i);
        }

        return sortedArr;
    }
}


//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends