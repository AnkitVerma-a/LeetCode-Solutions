class Solution {
    public int diagonalSum(int[][] mat) {
      int i=0;
      int j=0;
      int sum=0;
      while(j<mat.length){
        sum+=mat[i][j]+mat[i][mat.length-i-1];
        if(j==mat.length-i-1){
            sum-=mat[i][j];
        }
        i++;
        j++;
      }  
    return sum;
    }
}