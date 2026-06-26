class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            num=(num*26+(ch-'A')+1);
        }
        return num;
    }
}