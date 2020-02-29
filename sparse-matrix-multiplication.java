class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int row = A.length, col = B[0].length;
        int[][] res = new int[row][col];
        for(int r=0; r<A.length; ++r){
            for(int c=0; c<col; ++c){
                for( int k = 0; k<A[0].length; ++k)
                    res[r][c] += A[r][k]*B[k][c];    
                }
        }
        return res;
    }
}   