class Solution {
    public int f(int i,int[] cost,int[] dp){
        dp[0]=cost[0];
        dp[1]=cost[1];
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=2;j<=i;j++){
            int one=cost[j]+dp[j-1];
            int two=cost[j]+dp[j-2];
            dp[j]=Math.min(one,two);
        }
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==0)return 0;
        if(n==1)return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        f(n-1,cost,dp);
        int path1=dp[n-1];
        int path2=dp[n-2];
        return Math.min(path1,path2);
    }
}