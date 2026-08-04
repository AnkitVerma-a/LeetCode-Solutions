class Solution {
    public void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void f(int idx,int[] arr,List<List<Integer>> ls1){
        if(idx==arr.length){
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ls.add(arr[i]);
            }
            ls1.add(ls);
        return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            f(idx+1,arr,ls1);
            swap(i,idx,arr);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls1= new ArrayList<>();
        f(0,nums,ls1);
        return ls1;
    }
}