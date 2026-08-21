class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> ans=new ArrayList<>();
        if(n<=0){
            return ans;
        }
        for(int i=0;i<n;i++){
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    ls.add(1);
                }else{
                    List<Integer> prev = ans.get(i-1);
                    ls.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(new ArrayList<>(ls));
        }
        return ans;
    }
}