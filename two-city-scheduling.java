class Solution {
    public int twoCitySchedCost_dp(int[][] costs) {
        int n = costs.length/2;
        int dp[][] = new int[n+1][n+1];
        
        for(int i=1; i<=n; ++i) dp[i][0] = dp[i-1][0] + costs[i-1][0];
        for(int i=1; i<=n; ++i) dp[0][i] = dp[0][i-1] + costs[i-1][1];
        
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                dp[i][j] = Math.min((dp[i][j-1]+costs[i+j-1][1]), dp[i-1][j] + costs[i+j-1][0]);
            }
        }
        return dp[n][n];
    }
    
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<int[]> pq = new PriorityQueue( new Comparator<int[]>(){
           @Override
             public int compare(int[] A, int[] B){
                return (B[1] - B[0]) - (A[1] -A[0]);
            }
        });
        for(int[] cost : costs) pq.add(cost);
        int res =0, n = costs.length/2, ind =0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            if(ind <n){
                res += curr[0];
                ++ind;
            }else res+= curr[1];
        }
        return res;
    }
    
    
}