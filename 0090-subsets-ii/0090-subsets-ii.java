class Solution {
    public void f(int idx,int[] arr,List<Integer> ls,List<List<Integer>> ls1){
        ls1.add(new ArrayList<>(ls));
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            ls.add(arr[i]);
            f(i+1,arr,ls,ls1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ls1 = new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,ls,ls1);
        return ls1;
    }
}