class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        if(numRows==0){
            return ls;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> preRow = ls.get(i-1);
                    int num1=preRow.get(j-1);
                    int num2=preRow.get(j);
                    row.add(num1+num2);
                }

            }
            ls.add(row);
        }
        return ls;
    }
}