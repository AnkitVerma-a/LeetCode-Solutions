class Solution {
    public int maxProduct(int[] nums) {
        int pre=0;
        int max=0;
        for(int num : nums){
            if(num>max){
                pre=max;
                max=num;
            }else if(num>pre){
                pre=num;
            }
        }
        return (pre-1)*(max-1);
    }
}