class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]==nums[j]){
                j+=3;
            }
        }
        return nums[j];
    }
}