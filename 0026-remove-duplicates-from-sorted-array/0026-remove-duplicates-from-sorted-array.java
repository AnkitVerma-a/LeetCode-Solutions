class Solution {
    public void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int removeDuplicates(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[idx]){
                continue;
            }
            swap(i,idx+1,nums);
            idx++;
        }
        return idx+1;
    }
}