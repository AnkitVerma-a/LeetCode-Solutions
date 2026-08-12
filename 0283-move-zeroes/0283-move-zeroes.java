class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
    }
}