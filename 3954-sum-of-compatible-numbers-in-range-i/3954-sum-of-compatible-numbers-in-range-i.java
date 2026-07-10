class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int count=0;
        for(int x=0;x<=n+k;x++){
            if(Math.abs(n-x)<=k && (n&x)==0){
                count+=x;
            }
        }
        return count;
    }
}