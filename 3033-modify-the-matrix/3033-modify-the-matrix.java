class Solution {
    public int Max(int[][] matrix,int j){
        int maxv=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            maxv=Math.max(maxv,matrix[i][j]);
        }
        return maxv;
    }
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=Max(matrix,j);
                }
            }
        }
        return matrix;
    }
}