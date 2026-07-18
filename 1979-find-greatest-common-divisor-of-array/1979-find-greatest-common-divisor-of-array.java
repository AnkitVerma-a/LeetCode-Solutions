class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int maxVal = 0;
        int minVal = 2000;
        for(int num : nums){
            maxVal=Math.max(num,maxVal);
            minVal=Math.min(num,minVal);
        }
        return gcd(maxVal,minVal);
    }
}