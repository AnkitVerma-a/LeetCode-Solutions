class Solution {
    public int longestValidParentheses(String s) {
        int max=0; int open=0; int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
            if(open==close){
                max=Math.max(max,2*close);
            }
            if(close>open){
                open=0;
                close=0;
            }

        }
        open =0;
        close=0;
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == '(') {
                open++;
            } else {
                close++;
            }
            if(open==close){
                max=Math.max(max,2*open);
            }
            if(open>close){
                open=0;
                close=0;
            }
        }
        return max;

    }
}