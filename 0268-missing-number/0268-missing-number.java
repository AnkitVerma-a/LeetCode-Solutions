class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^i^nums[i];
        }
        a=a^nums.length;
        return a;
    }
}