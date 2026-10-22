class Solution {
    public int Isvalid(int[][] mat,int mid){
        int max=0;
        int idx=0;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][mid]){
                max=mat[i][mid];
                idx=i;
            }
        }
        int left = (mid - 1 >= 0) ? mat[idx][mid - 1] : -1;
        int right = (mid + 1 < mat[idx].length) ? mat[idx][mid + 1] : -1;
        if (max > left && max > right) {
            return idx;
        }else if(max<right){
            return -3;
        }else{
            return -2;
        }
    }
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Isvalid(mat,mid)!=-3 && Isvalid(mat,mid)!=-2){
                return new int[]{Isvalid(mat,mid),mid};
            }else if(Isvalid(mat,mid)==-3){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}