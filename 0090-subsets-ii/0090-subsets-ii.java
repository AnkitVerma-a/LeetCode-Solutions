class Solution {
    public void f(int idx,int[] arr,List<Integer> ls,List<List<Integer>> ans){
     ans.add(new ArrayList(ls));

        for(int i=idx;i<arr.length;i++){
        if(i>idx && arr[i]==arr[i-1])continue;
        ls.add(arr[i]);
        f(i+1,arr,ls,ans);
        ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,ls,ans);
        return ans;
    }
}