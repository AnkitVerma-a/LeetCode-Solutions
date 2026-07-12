class Solution {
    public int editDistance(int i,int j,String word1,String word2,int[][] dp){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return editDistance(i-1,j-1,word1,word2,dp);
        }
        //insert
        int in = 1+editDistance(i,j-1,word1,word2,dp);
        //delete
        int de =1+editDistance(i-1,j,word1,word2,dp);
        //replace
        int re =1+editDistance(i-1,j-1,word1,word2,dp);
        return dp[i][j]=Math.min(in,Math.min(de,re));
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return editDistance(m-1,n-1,word1,word2,dp);
    }
}