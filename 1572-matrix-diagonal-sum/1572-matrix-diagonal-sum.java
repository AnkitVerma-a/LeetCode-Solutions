class Solution {
    public int diagonalSum(int[][] mat) {
      int i=0;
      int sum=0;
      while(i<mat.length){
        sum+=mat[i][i]+mat[i][mat.length-i-1];
        if(i==mat.length-i-1){
            sum-=mat[i][i];
        }
        i++;
      }  
    return sum;
    }
}