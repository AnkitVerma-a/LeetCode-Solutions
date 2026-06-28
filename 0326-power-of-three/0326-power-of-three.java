class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        double x = Math.log10(n)/Math.log10(3);
        if(x>0.0 && x%1==0){
            return true;
        }
        return false;
    }
}