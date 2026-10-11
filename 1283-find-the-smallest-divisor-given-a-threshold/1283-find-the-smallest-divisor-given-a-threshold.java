class Solution {
    private int f(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold){
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int divisor=0;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(f(nums,mid)<=threshold){
                divisor=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return divisor;
    }
}