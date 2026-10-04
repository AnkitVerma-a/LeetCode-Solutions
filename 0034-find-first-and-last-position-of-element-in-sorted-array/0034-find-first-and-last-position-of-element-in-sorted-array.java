class Solution {
    public int[] searchRange(int[] nums, int target) {
        //lower bound
        int low=0;
        int high=nums.length-1;
        int lb=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                lb=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        int ub=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ub=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(lb==-1||nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,ub-1};
    }
}