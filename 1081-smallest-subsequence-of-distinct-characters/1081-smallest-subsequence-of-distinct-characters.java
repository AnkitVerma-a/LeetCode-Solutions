public class Solution {
    public static String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        StringBuilder stack = new StringBuilder();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int currIdx = curr - 'a';
            if (visited[currIdx]) {
                continue;
            }
            while (stack.length() > 0) {
                char top = stack.charAt(stack.length() - 1);
                int topIdx = top - 'a';
                if (top > curr && lastIndex[topIdx] > i) {
                    stack.deleteCharAt(stack.length() - 1);
                    visited[topIdx] = false;
                } else {
                    break;
                }
            }
            stack.append(curr);
            visited[currIdx] = true;
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println("Result: " + smallestSubsequence(s));
    }
}