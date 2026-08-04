class Solution {
    public void f(int[] arr,List<Integer> ls,List<List<Integer>> ls1,boolean[] flag){
        if(ls.size()==arr.length){
        ls1.add(new ArrayList<>(ls));
        return;
        }
        for(int i=0;i<arr.length;i++){
            if(!flag[i]){
                ls.add(arr[i]);
                flag[i]=true;
                f(arr,ls,ls1,flag);
                ls.remove(ls.size()-1);
                flag[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ls1= new ArrayList<>();
        boolean[]  flag = new boolean[nums.length];
        f(nums,ls,ls1,flag);
        return ls1;
    }
}