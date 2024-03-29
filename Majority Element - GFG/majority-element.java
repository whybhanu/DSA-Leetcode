//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int majorityElement(int a[], int size){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < size; i++){
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
            else map.put(a[i], 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((p, b) -> map.get(b) - map.get(p));
        pq.addAll(map.keySet());
        int max = pq.poll();
        
        if(map.get(max) > size/2) return max;
        return -1;
    }
}