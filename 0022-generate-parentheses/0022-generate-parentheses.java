class Solution {
    public List<String> f(int n,List<String>[] dp){
        List<String> ls = new ArrayList<>();
        if(n==0){
            ls.add("");
            return ls;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        for(int i=0;i<n;i++){
            List<String> inside = f(i,dp);
            List<String> outside = f(n-1-i,dp);
            for(String in:inside){
                for(String out:outside){
                    ls.add("("+in+")"+out);
                }
            }
        }
        return dp[n]=ls;
    }
    public List<String> generateParenthesis(int n) {
        List<String>[] dp = new ArrayList[n+1];
        return f(n,dp);
    }
}