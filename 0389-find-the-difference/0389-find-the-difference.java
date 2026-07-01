class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<t.length();i++){
            if(i!=s.length()){
            sum1+=(s.charAt(i)-'a');
            }
            sum2+=(t.charAt(i)-'a');
        }
        char r = (char)(sum2-sum1+'a');
        return r;
    }
}