class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int low,int high,int[] nums){
        while(low<high){
            swap(low,high,nums);
            low++;
            high--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i=n-1;i>=idx;i--){
            if(nums[i]>nums[idx]){
                swap(i,idx,nums);
                break;
            }
        }
        reverse(idx+1,n-1,nums);
    }
}