class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        for(int i=num.length()-1;i>=0;i--){
            int n=num.charAt(i)-'0';
            if(n%2!=0){
                idx=i;
                break;
            }
        }
        return (idx == -1) ? "": num.substring(0,idx+1);
    }
}