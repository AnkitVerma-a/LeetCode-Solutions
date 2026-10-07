class Solution {
    private long f(int mid,int[] piles){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            int d=piles[i]/mid;
            if(piles[i]%mid==0){
                sum+=d;
            }else{
                sum+=(d+1);
            }
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int low=1;
        int high=maxi;
        int k=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(f(mid,piles)<=h){
                k=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return k;
    }
}