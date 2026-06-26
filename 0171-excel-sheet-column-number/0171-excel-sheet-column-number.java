class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            if(num==0){
                num=((ch-'A')+1);
            }else{
                num=(num*26+(ch-'A')+1);
            }
        }
        return num;
    }
}