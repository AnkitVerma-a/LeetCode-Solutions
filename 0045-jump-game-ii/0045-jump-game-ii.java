class Solution {
    public int f(int i,int[] nums,int[] dp){
        if(i==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=0;j<i;j++){
            if(j+nums[j]>=i){
                int steps = 1+f(j,nums,dp);
                min=Math.min(min,steps);
            }
        }
        return dp[i]= min;
        
    }
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return f(nums.length-1,nums,dp);
    }
}