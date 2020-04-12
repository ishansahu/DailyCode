class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int res =0;
        int[][] mat = new int[n][m];
        for(int[] index : indices){
            int r = index[0], c = index[1];
            for(int i=0; i<m ; ++i) ++mat[r][i];
            for(int i=0; i<n; ++i) ++mat[i][c];
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; ++j){
                if(mat[i][j]%2 !=0 ) ++res;
            }
        }
        return res;
    }
}