class Solution {
    public int findmax(int l, int r, int[] nums)
    {
        int max=0;
        for(int i=l;i<=r;i++)
        {
            max=Math.max(max,i+nums[i]);
        }
        return max;
    }
    public int jump(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        int l=0;
        int r=0;
        int jumps=0;
        while(r<nums.length-1)
        {
            jumps++;
            int max=findmax(l,r,nums);
            l=r+1;
            r=max;
        }
        return jumps;
    }
}