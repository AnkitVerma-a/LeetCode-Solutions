class Solution {
    public int maxProduct(int[] nums) {
        int preMax=0;
        int max = 0;
        Arrays.sort(nums);
        for(int num : nums){
            if(num>=max){
                preMax=max;
                max=num;
            }
        }
        return (preMax-1)*(max-1);
    }
}