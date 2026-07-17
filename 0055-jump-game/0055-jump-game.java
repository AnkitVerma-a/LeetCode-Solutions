class Solution {
    public boolean f(int i,int[] nums,Boolean[] dp){
        if(i>=nums.length-1) return true;
        int k=nums[i];
        if(dp[i] != null) return dp[i];
        for(int j=1;j<=k;j++){
            if(f(i+j,nums,dp)){
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0){
            return false;
        }
        Boolean[] dp=new Boolean[nums.length];
        return f(0,nums,dp);
    }
}
