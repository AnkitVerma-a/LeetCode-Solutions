class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n>1){
        double num = Math.log10(n)/Math.log10(4);
        if(num>0.0 && num%1.0==0.000000000000000000){
            return true;
        }
        }
        return false; 
    }
}