class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int n = nums.length;
        int maxv = Integer.MIN_VALUE; 
        int minv = Integer.MAX_VALUE;
        int suffMinIdx = -1;          
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxv) {
                maxv = nums[i];
            }
            if (suffMinIdx < i) {
                minv = nums[i];
                suffMinIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] <= minv) { 
                        minv = nums[j];
                        suffMinIdx = j;
                    }
                }
            }
            if ((maxv - minv) <= k) {
                return i; 
            }
        }
        return -1;
    }
}
