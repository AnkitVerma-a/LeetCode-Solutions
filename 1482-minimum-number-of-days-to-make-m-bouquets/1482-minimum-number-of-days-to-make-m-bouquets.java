class Solution {
    public boolean f(int[] arr,int n,int k,int mid){
        int count=0;
        int a=0;
        for(int i=0;i<arr.length;i++){
                if(mid>=arr[i]){
                        count+=1;
                        if(count==k){
                                count=0;
                                a+=1;
                        }
                }else{
                        count=0;
                }
        }
        return a>=n;
    }
    public int minDays(int[] bloomDay, int m, int k) {
                int low=Integer.MAX_VALUE;
                int high=Integer.MIN_VALUE;
                for(int i:bloomDay){
                        low=Math.min(low,i);
                        high=Math.max(high,i);
                }
                int ans=-1;
                while(low<=high){
                        int mid=low+(high-low)/2;
                        if(f(bloomDay,m,k,mid)){
                                ans=mid;
                                high=mid-1;
                        }else{
                                low=mid+1;
                        }
                }
                return ans;
    }
}