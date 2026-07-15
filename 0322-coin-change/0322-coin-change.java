class Solution {
    public int f(int i,int amount,int[] coins,int[] dp){
        dp[0]=0;
        for(int coin : coins){
            for(int j=coin;j<=amount;j++){
                dp[j]=Math.min(dp[j],1+dp[j-coin]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        int m= f(n-1,amount,coins,dp);
        return m;
    }
}