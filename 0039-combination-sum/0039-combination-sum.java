class Solution {
    public void f(int idx,List<Integer> ls,int[] arr,int k,int sum,List<List<Integer>> ls1){
        if(sum>k){
            return;
        }
        if(idx==arr.length||sum==k){
            if(sum==k){
                ls1.add(new ArrayList<>(ls));
            }
            return;
        }
        ls.add(arr[idx]);
        f(idx,ls,arr,k,sum+arr[idx],ls1);
        ls.remove(ls.size()-1);
        f(idx+1,ls,arr,k,sum,ls1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ls1=new ArrayList<>();
        f(0,ls,candidates,target,0,ls1);
        return ls1;
    }
}