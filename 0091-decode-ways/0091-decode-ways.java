class Solution {
    public int f(int i,String s,int[] dp){
        if(i<0)return 1;
        if(dp[i]!=-1)return dp[i];
        int a=0;
        if(s.charAt(i)-'0'!=0){
            a=f(i-1,s,dp);
        }
        int b=0;
        if(i>=1){
            if(s.charAt(i-1)-'0'!=0){
                if(s.charAt(i-1)-'0'<2){
                    b=f(i-2,s,dp);
                }else if(s.charAt(i-1)-'0'==2){
                    if(s.charAt(i)-'0'<=6){
                    b=f(i-2,s,dp);
                    }
                }
            }
        }
        return dp[i]=a+b;
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return f(s.length()-1,s,dp);
    }
}