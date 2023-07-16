class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return dfs(grid, 0, 0, grid.length, grid[0].length, dp);
    }
    int dfs(int[][] grid, int i, int j, int m, int n, int[][] dp){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1) return 0;
        if(i == m - 1 && j == n - 1) {
            dp[i][j] = 1;
            return dp[i][j];
        }
        if(dp[i][j] != 0) return dp[i][j];
        int right = dfs(grid, i + 1, j, m, n, dp);
        int left = dfs(grid, i, j + 1, m, n, dp);
        dp[i][j] = right + left;
        return dp[i][j];
    }
}