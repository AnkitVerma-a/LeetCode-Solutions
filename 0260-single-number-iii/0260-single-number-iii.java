class Solution {
    public int[] singleNumber(int[] nums) {
        int xor =0;
        for(int num:nums){
            xor=xor^num;
        }
        int mask = xor & (-xor);
        int num1 = 0;
        int num2 = 0;
        for (int n : nums) {
            if ((n & mask) == 0) {
                num1 ^= n;
            } else {
                num2 ^= n;
            }
        }
        return new int[]{num1, num2};
    }
}