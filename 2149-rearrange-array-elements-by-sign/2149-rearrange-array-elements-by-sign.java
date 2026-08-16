class Solution {
    public int[] rearrangeArray(int[] nums) {
        int plus=0;
        int minus=1;
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                num[plus]=nums[i];
                plus+=2;
            }
            if(nums[i]<0){
                num[minus]=nums[i];
                minus+=2;
            }
        }
        return num;
    }
}