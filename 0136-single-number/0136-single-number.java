class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]==nums[j]){
                j+=2;
            }
        }
        return nums[j];
    }
}