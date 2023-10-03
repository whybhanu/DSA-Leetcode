//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution{    
    public static boolean isAnagram(String s1,String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(map1.containsKey(ch)) map1.put(ch, map1.get(ch)+1);
            else map1.put(ch, 1);
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map2.containsKey(ch)) map2.put(ch, map2.get(ch)+1);
            else map2.put(ch, 1);
        }
        return map1.equals(map2);
        
    }
}