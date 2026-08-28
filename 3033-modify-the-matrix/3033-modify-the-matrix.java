class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int j=0;j<n;j++){
            int maxv=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                maxv=Math.max(maxv,matrix[i][j]);
            }
            for(int i=0;i<m;i++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maxv;
                }
            }
        }
        return matrix;
    }
}