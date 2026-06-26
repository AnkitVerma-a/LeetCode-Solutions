class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        char[] chars = s.toCharArray();
        int n = chars.length;
        int start = 0, end = 0;
        int i = 0;

        while (i < n) {
            int left = i;
            int right = i;
            while (right + 1 < n && chars[i] == chars[right + 1]) {
                right++;
            }
            int nextI = right + 1;

            while (left - 1 >= 0 && right + 1 < n && chars[left - 1] == chars[right + 1]) {
                left--;
                right++;
            }
            if (right - left > end - start) {
                start = left;
                end = right;
            }

            i = nextI; 
        }

        return s.substring(start, end + 1);
    }
}
