class Solution {
    public void rotate(int[][] mat) {
        int temp =0;
        int n = mat.length;
        for(int i=0; i< n;++i){
            for(int j=i; j<n; ++j){
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<n;++i){
            for(int j=0; j<n/2 ; ++j){
                temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
    }
}