class Solution {
    public void f(int idx,List<Integer> ls,int[] arr,int sum,List<List<Integer>> ls1){
        if(sum==0){
            ls1.add(new ArrayList<>(ls));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>sum)break;
            if(i>idx && arr[i]==arr[i-1])continue;
            ls.add(arr[i]);
            f(i+1,ls,arr,sum-arr[i],ls1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ls =new ArrayList<>();
        List<List<Integer>> ls1=new ArrayList<>();
        Arrays.sort(candidates);
        f(0,ls,candidates,target,ls1);
        return ls1;
    }
}