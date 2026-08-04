class Solution {
    public void f(int idx,List<Integer> ls,int[] arr,int sum,List<List<Integer>> ls1){
        if(idx==arr.length || sum==0){
            if(sum==0){
                ls1.add(new ArrayList<>(ls));
            }
            return;
        }
        if(arr[idx]<=sum){
            ls.add(arr[idx]);
            f(idx,ls,arr,sum-arr[idx],ls1);
            ls.remove(ls.size()-1);
        }
        f(idx+1,ls,arr,sum,ls1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ls1=new ArrayList<>();
        f(0,ls,candidates,target,ls1);
        return ls1;
    }
}