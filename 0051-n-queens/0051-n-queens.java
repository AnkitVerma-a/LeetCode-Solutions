class Solution {
    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
    public void solve(int col,char[][] board,int[] ud,int[] ld,int[] l,int n,List<List<String>> ls){
        if(col==n){
            ls.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(ud[row+col]==0 && ld[n-1+col-row]==0 && l[row]==0){
                board[row][col]='Q';
                ud[row+col]=1;
                ld[n-1+col-row]=1;
                l[row]=1;
                solve(col+1,board,ud,ld,l,n,ls);
                board[row][col]='.';
                ud[row+col]=0;
                ld[n-1+col-row]=0;
                l[row]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        int[] upperdia=new int[2*n-1];
        int[] lowerdia=new int[2*n-1];
        int[] left = new int[n];
        List<List<String>> ls = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] ch:board){
            Arrays.fill(ch,'.');
        }
        solve(0,board,upperdia,lowerdia,left,n,ls);
        return ls;
    }
}