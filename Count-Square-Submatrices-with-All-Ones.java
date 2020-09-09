class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] dp = new int[r][c];
        
        for(int i=0; i<r; ++i) dp[i][0] = matrix[i][0];
        for(int j=0; j<c; ++j) dp[0][j] = matrix[0][j];
        for(int i=1; i<r;++i){
            for(int j=1; j<c; ++j){
                if(matrix[i][j] ==1){
                    if(dp[i-1][j]>0 && dp[i][j-1]>0 && dp[i-1][j-1]>0){
                        dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                    }else{
                        dp[i][j] = matrix[i][j];
                    }
                }
            }
        }
        int res=0;
        for(int i=0; i<r; ++i){
            for(int j=0; j<c; ++j){
                res += dp[i][j];
            }
        }
        return res;
    }
}