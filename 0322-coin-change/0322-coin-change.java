class Solution {
    public int f(int k,int amount,int[] coins){
        int[][] dp = new int[k+1][amount+1];

        for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
        }
        for (int j = 1; j <= amount; j++) {
            if (j >= coins[0] && dp[0][j - coins[0]] != (int)1e9) {
                dp[0][j] = 1 + dp[0][j - coins[0]];
            }else{
                dp[0][j] = (int)1e9;
            }
        }
        for(int i=1;i<=k;i++){
            for(int j=1;j<=amount;j++){
                int take = (int)1e9;
                if (j - coins[i] >= 0) {
                    take = 1 + dp[i][j - coins[i]];
                }
                int skip=0+dp[i-1][j];
                dp[i][j]= Math.min(take,skip);
            }
        }
        return dp[k][amount];
    }
    public int coinChange(int[] coins, int amount) {
        if(f(coins.length-1,amount,coins)==(int)1e9) return -1;
        return f(coins.length-1,amount,coins);
    }
}