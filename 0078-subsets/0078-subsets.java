class Solution {
    public void f(int idx,int[] arr,List<Integer> ls,List<List<Integer>> ans){
        if(idx==arr.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[idx]);
        f(idx+1,arr,ls,ans);
        ls.remove(ls.size()-1);
        f(idx+1,arr,ls,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        f(0,nums,ls,ans);
        return ans;
    }
}