class Solution {
    public int mincostTickets_brute(int[] days, int[] costs) {
        int[] dp = new int[366];
        int index=0;
        for(int i=1;i<=365; ++i){
            if(days[index] == i){
                dp[i] = Math.min(dp[i-1]+costs[0], Math.min(dp[Math.max(0,i-7)]+costs[1],dp[Math.max(0,i-30)]+costs[2]));
                ++index;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[365];
    }
    
    //optimised(for only 1 year)
    public int mincostTickets_optimised(int[] days, int[] costs) {
        int[]dp = new int[30];
        int index = 0;
        for(int i= days[0]; i<=days[days.length-1]; ++i){
            if(days[index] == i){
                dp[i%30] = Math.min(dp[(i-1)%30]+costs[0], Math.min(dp[Math.max(0,i-7)%30]+costs[1], dp[Math.max(0,i-30)%30]+costs[2]));
                ++index;
            }else{
                dp[i%30] = dp[(i-1)%30];
            }
        }
        return dp[days[(days.length-1)]%30];
    }
    
    //Genric 
    public int mincostTickets(int[] days, int[] costs) {
        Queue<int[]> last7 = new LinkedList();
        Queue<int[]> last30 = new LinkedList();
        
        int total = 0;
        for(int day:days ){
            while(!last7.isEmpty() && last7.peek()[0]+7<=day) last7.poll();
            while(!last30.isEmpty() && last30.peek()[0]+30<=day) last30.poll();
            last7.add(new int[]{day, total+costs[1]});
            last30.add(new int[]{day, total+costs[2]});
            total = Math.min(costs[0]+ total, Math.min(last7.peek()[1], last30.peek()[1]));
        }
        return total;
        
    }
    
    
}