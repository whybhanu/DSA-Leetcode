class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            int start = 0;
            int end = grid[0].length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if (grid[i][mid] >= 0) start = mid + 1;
                else{
                    count += end - mid + 1;
                    end = mid - 1;
                }
            }
        }
        return count;
    }
}