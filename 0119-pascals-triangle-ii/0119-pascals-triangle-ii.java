class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ls = new ArrayList<>();
        if(rowIndex==0){
            List<Integer> row0 = new ArrayList<>();
            row0.add(1);
            return row0;
        }
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                List<Integer> preRow = ls.get(i-1);
                int num1 = preRow.get(j-1);
                int num2 = preRow.get(j);
                row.add(num1+num2);
                }
            }
            ls.add(row);
        }
        return ls.get(rowIndex);
    }
}