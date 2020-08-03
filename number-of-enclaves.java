class Solution {
    public int numEnclaves(int[][] A) {
        if(A== null || A.length ==0|| A[0]==null || A[0].length ==0) return 0;
        int row = A.length-1, col = A[0].length-1;
        for(int r=0; r<=row; ++r){
            if(A[r][0]==1) helper(A,r,0);
            if(A[r][col]==1) helper(A,r,col);
        }
        for(int c=0; c<=col; ++c){
            if(A[0][c]==1) helper(A,0,c);
            if(A[row][c]==1) helper(A,row,c);
        }
        
        int res =0;
        for(int r = 1; r<=row-1; ++r){
            for(int c=1 ; c<=col-1; ++c){
                if(A[r][c] ==1) ++res;
            }
        }
        return res;
    }
    
    private void helper(int[][] A, int r, int c){
        if(r==A.length || r<0 || c==A[0].length || c<0 || A[r][c]==0)return;
        
        A[r][c]=0;
        helper(A,r-1,c);
        helper(A,r+1,c);
        helper(A,r,c-1);
        helper(A,r,c+1);
    }
}