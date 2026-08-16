class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=nums[0];
        int MaxS=0;
        for(int i=0;i<nums.length;i++){
            if(MaxS<nums[i]-minPrice){
                MaxS=nums[i]-minPrice;
            }
            if(nums[i]<minPrice){
                minPrice=nums[i];
            }
        }
        return MaxS;
    }
}