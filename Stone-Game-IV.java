class Solution {
    public boolean winnerSquareGame_momoization(int n) {
        int[] dp = new int[n+1];
        dp[0] =-1;
        return helper(dp,n);
    }
    
    public boolean helper(int[] dp, int n){
        if(dp[n] !=0){
            if(dp[n] ==-1) return false;
            return true;
        }
        int curr = (int)Math.sqrt(n);
        for(int i=1; i<=curr; ++i){
            if(!helper(dp, n-i*i)){
                dp[n] = 1;
                return true;
            }
        }
        dp[n] = -1;
        return false;
    }
    
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n+1];
        
        for(int i=0; i<=n; ++i){
            int k = (int) Math.sqrt(i);
            for(int j = 1; j<=k; ++j){
                if(dp[i-j*j]==false){
                    dp[i] = true;
                    break;
                }
            }
            
        }
        return dp[n];
    }

}