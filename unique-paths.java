class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for(int r=0; r<n;++r){
            for(int c=0; c<m; ++c){
                if(r==0 && c==0) dp[r][c] =1;
                else if(r==0) dp[r][c] =dp[r][c-1];
                else if(c==0) dp[r][c] =dp[r-1][c];
                else dp[r][c] = dp[r-1][c] + dp[r][c-1];
            }
        }
        return dp[n-1][m-1];
    }
}