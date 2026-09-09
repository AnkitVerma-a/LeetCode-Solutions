class Solution {
    public long countCommas(long n) {
        long comma = 0;
        long tier = 1000;
        while (n >= tier) {
            comma += (n - tier + 1);
            if (tier > Long.MAX_VALUE / 1000) break;
            tier *= 1000;
        }
        return comma;
    }
}