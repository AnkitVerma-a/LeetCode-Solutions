public class Solution {
    public static int missingMultiple(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] % k == 0) {
                int correctIdx = (nums[i] / k) - 1;

                if (correctIdx >= n || nums[i] == nums[correctIdx]) {
                    break;
                }

                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int expectedMultiple = (i + 1) * k;
            if (nums[i] != expectedMultiple) {
                return expectedMultiple;
            }
        }

        return (n + 1) * k;
    }
}
