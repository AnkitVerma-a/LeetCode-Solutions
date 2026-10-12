class Solution {
    private int f(int[] arr,int days,int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                count+=1;
                sum=arr[i];
            }
        }
        if(count<=days){
            return 0;
        }else{
            return 1;
        }
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(f(weights,days,mid)==0){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}