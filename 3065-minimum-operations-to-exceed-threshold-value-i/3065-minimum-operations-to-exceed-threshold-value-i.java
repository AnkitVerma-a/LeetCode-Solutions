class Solution {
    public int minOperations(int[] nums, int k) {
        int n = 0;
        for (int num : nums) {
            if (num < k) {
                n++;
            }
        }
        return n;
    }
}
