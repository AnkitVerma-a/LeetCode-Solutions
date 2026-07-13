class Solution {
    public int f(int i,int j,List<List<Integer>> arr,int[][] dp){
        int n = arr.size();
        if(i==n-1){
            return arr.get(n-1).get(j);
        }
        if(dp[i][j]!=(int)1e5)return dp[i][j];
            int d =arr.get(i).get(j)+f(i+1,j,arr,dp);
            int dg =arr.get(i).get(j)+f(i+1,j+1,arr,dp);
        return dp[i][j]=Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp =new int[m][m];
        for(int[] arr:dp){
            Arrays.fill(arr,(int)1e5);
        }
        return f(0,0,triangle,dp);
    }
}