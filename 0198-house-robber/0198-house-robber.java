class Solution {
    public int f(int i,int[] a){
        if(a==null||a.length==0)return 0;
        if(a.length==1) return a[0];
        int prev=a[0];
        int prev1=0;
        for(int j=1;j<a.length;j++){
            int curr =  Math.max(a[j]+prev1,prev);           
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        return f(nums.length-1,nums);
    }
}