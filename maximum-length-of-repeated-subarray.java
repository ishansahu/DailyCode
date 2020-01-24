class Solution {
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n][m];
        for(int i=0; i<n; ++i) if(A[i] == B[0]) dp[i][0] = 1;
        for(int i=0; i<m; ++i) if(A[0] == B[i]) dp[0][i] = 1;
        int res = Integer.MIN_VALUE;
        for(int i=1; i<n; ++i){
            for(int j=1; j<m; ++j){
                if(A[i] == B[j]){
                    dp[i][j] = 1 + dp[i-1][j-1];  
                    res = Math.max(res, dp[i][j]);
                } 
            }
        }
        return res == Integer.MIN_VALUE ? 0 : res;
        
    }
}