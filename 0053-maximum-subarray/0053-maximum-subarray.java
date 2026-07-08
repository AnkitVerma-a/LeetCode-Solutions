class Solution {
    private int max= Integer.MIN_VALUE;
    public int f(int i,int[] nums,int[] dp){
        if(i==0){
            return max=Math.max(max,nums[i]);
        }
        if(dp[i]!=Integer.MIN_VALUE){
            return dp[i];
        }
        int maxi = Math.max(nums[i],nums[i]+f(i-1,nums,dp));
        max=Math.max(maxi,max);
        return dp[i] = maxi;
    }
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        f(nums.length-1,nums,dp);
        return max;
    }
}