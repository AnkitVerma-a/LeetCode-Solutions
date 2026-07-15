class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] arr=new int[n];
        int leftsum=0;
        int rightsum=0;
        int sum = 0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum=sum-leftsum-nums[i];
            int left=i;
            int right=n-1-i;
            int Tlsum = (nums[i] * left) - leftsum;
            int Trsum =  rightsum - (nums[i] * right);
            arr[i]=Tlsum+Trsum;
            leftsum += nums[i];
        }

        return arr;
    }
}