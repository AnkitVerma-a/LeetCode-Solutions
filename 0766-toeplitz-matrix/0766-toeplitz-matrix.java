class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // m+n-i+j
        Map<Integer,Integer> map=new HashMap<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=m+n+j-i;
                if(map.containsKey(val)){
                    if(map.get(val)!=matrix[i][j]){
                        return false;
                    }
                }else{
                    map.put(val,matrix[i][j]);
                }
            }
        }
        return true;
    }
}