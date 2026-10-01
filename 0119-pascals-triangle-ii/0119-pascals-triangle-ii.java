class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        long mul=1;
        for(int i=1;i<=rowIndex;i++){
            mul=mul*(rowIndex-i+1)/i;
            row.add((int)mul);
        }
        return row;
    }
}