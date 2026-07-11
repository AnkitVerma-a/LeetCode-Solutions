class Solution {
    public int f(int i,int j,int[][] dp,int[][] og){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(og[i][j]==1)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int left = f(i-1,j,dp,og);
        int up = f(i,j-1,dp,og);
        return dp[i][j]=left+up;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(m - 1, n - 1, dp,obstacleGrid);
    }
}