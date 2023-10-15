//{ Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        int left = 0, right = c-1, bottom = r-1, top = 0, direction = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(left <= right && bottom >= top){
            if(direction == 0){
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                top++;
                direction++;
            } else if(direction == 1){
                for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
                direction++;
            } else if(direction == 2){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--; 
                direction++;
            } else {
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }
        return res;
    }
}
