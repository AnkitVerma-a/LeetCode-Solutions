class Solution {
    public int f(int[] nums,int mid){
        int stdcnt=1;
        int pages=0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=mid){
                pages+=nums[i];
            }else{
                stdcnt++;
                pages=nums[i];
            }
        }
        return stdcnt;
    }
    public int splitArray(int[] nums, int k) {
        if(nums.length<k)return -1;
        int low=-1;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(f(nums,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}