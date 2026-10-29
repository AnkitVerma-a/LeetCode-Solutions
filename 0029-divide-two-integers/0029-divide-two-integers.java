class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == Integer.MIN_VALUE) return 0;
        boolean sign = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = false;
        }
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;

        while (n >= d) {
            long top = d;
            long i = 0;
            
            while ((top << 1) <= n) {
                top = top << 1;
                i++;
            }
            
            ans += (1L << i);
            n = n - top;
        }

        return sign ? (int) ans : (int) -ans;
    }
}
