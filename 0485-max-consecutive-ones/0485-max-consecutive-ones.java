class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int maxsum = 0;
        for(int n : nums){
            if(n==1){
                sum++;
                if(sum>maxsum){
                    maxsum=sum;
                }
            }else{
                sum=0;
            }
        }
        return maxsum;
    }
}