class Solution {
    public boolean canPartition(int[] nums) {
	    int total = 0;
		for(int num : nums) total +=num;
		if(total%2==1) return false;
		int n = nums.length;
		int target = total/2;
		boolean[][] dp = new boolean[n+1][target+1];
		for(int i=0; i<=n; ++i)dp[i][0] = true;
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=target; ++j) {
				if(j>=nums[i-1]) {
					dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][target];
	}

}