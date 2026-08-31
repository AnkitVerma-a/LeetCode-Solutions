class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=-1;
        boolean result=true;
        while(n>0){
            int rem=n%2;
            if(rem==prev){
                result=false;
                break;
            }
            prev=rem;
            n=n/2;
        }
        return result;
    }
}