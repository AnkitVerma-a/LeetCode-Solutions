class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumL = 0, sumR = 0;
        int qL = 0, qR = 0;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                if (num.charAt(i) == '?') qL++;
                else sumL += num.charAt(i) - '0';
            } else {
                if (num.charAt(i) == '?') qR++;
                else sumR += num.charAt(i) - '0';
            }
        }
        return (sumL - sumR) != (qR - qL) * 9 / 2.0;
    }
}