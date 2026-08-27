class Solution {
    public int diagonalSum(int[][] mat) {
      int i=0;
      int j=0;
      int k=mat.length-1;
      int sum=0;
      while(j<mat.length && k>=0){
        sum+=mat[i][j]+mat[i][k];
        if(j==k){
            sum-=mat[i][j];
        }
        i++;
        j++;
        k--;
      }  
    return sum;
    }
}