class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        int[][] dp = new int[n+1][n+1];
        Arrays.sort(satisfaction);
        dp[0][0] = 0;
        for(int i=1; i<n+1;++i){
            dp[0][i] = i;
        }
        for(int i=1; i<n+1; ++i){
            for(int j=1; j<n+1; ++j){
                if(i+j>n+1){
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i][j-1] + dp[0][j]*satisfaction[i+j-2];     
                }
            }
        }
        return dp[n][n]<0?0:dp[n][n];
    }
     public int maxSatisfaction_discuss(int[] A) {
        Arrays.sort(A);
        int res = 0, total = 0, n = A.length;
        for (int i = n - 1; i >= 0 && A[i] > -total; --i) {
            total += A[i];
            res += total;
        }
        return res;
    }
}