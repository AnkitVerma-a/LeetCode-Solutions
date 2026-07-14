class Solution {
    public int f(int i,int j,int[] coins,int[][] dp){
        if(j==0) return 0;
        if(j <0 || i<0) return (int)1e9;
        if(dp[i][j]!=-1) return dp[i][j];
        int take = 1+f(i,j-coins[i],coins,dp);
        int skip=0+f(i-1,j,coins,dp);
        return dp[i][j]=Math.min(take,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        int n =f(coins.length-1,amount,coins,dp);
        if(n==(int)1e9)return -1;
        return n;
    }
}