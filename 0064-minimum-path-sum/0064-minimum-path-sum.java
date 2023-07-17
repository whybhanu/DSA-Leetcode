class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return minPath(grid, 0, 0, 0, dp);
    }

    int minPath(int[][] grid, int sum, int i, int j, int[][] dp){
        if(i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;
        if(i == grid.length - 1 && j == grid[0].length - 1){
            return grid[i][j];
        }
        if(dp[i][j] > 0) return dp[i][j];
        int right = minPath(grid, sum + grid[i][j], i + 1, j, dp);
        int down = minPath(grid, sum + grid[i][j], i, j + 1, dp);
        return dp[i][j] = Math.min(right, down) + grid[i][j];
    }
}