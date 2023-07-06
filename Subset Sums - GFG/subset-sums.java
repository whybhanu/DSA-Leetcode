//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        helper(0, arr, 0);
        return list;
    }
    
    void helper(int index, ArrayList<Integer> arr, int sum){
        if(index == arr.size()){
            list.add(sum);
            return;
        }
        sum = sum + arr.get(index);
        helper(index + 1, arr, sum);
        sum -= arr.get(index);
        helper(index + 1, arr, sum);
    }
}