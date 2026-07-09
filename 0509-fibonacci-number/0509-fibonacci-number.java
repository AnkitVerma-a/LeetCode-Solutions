class Solution {
    public int f(int i,int[] dp){
        dp[0]=0;
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[1]=1;
        for(int j=2;j<=i;j++){
            dp[j]=dp[j-1]+dp[j-2];
        }
        return dp[i];
    }
    public int fib(int n) {
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
        
    }
}