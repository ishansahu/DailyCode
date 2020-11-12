class Solution {
    
    int res;
    public int coinChange_brute(int[] coins, int amount) {
        res = Integer.MAX_VALUE;
        
        helper(coins, coins.length-1, amount, 0);
        return res==Integer.MAX_VALUE?-1:res;
    }
    
    public void helper(int[] coins, int n, int amount, int count){
        if(n<0 || amount<0) return ;
        if(amount == 0){
          res = Math.min(res, count);
          return;
        } 
        helper(coins, n-1, amount, count);
        helper(coins, n, amount - coins[n],1+count);
        
    }
    
    //memoization
    public int coinChange_memo(int[] coins, int amount) {
        //Arrays.sort(coins);
        return coin_memo(coins, coins.length-1,amount,new HashMap());
    }
    
    public int coin_memo(int[] coins, int n, int amount, HashMap<String, Integer> map){
        if(n<0 || amount<0 ) return -1;
        if(amount == 0) return 0;
        String key = n+"-"+amount;
        if(map.containsKey(key)) return map.get(key);
        
        int count = Integer.MAX_VALUE;
        int with = coin_memo(coins, n, amount-coins[n], map);
        if(with != -1) count = Math.min(count, with+1);
        
        int without = coin_memo(coins, n-1, amount, map);
        if(without != -1) count = Math.min(count, without);
        
        if(count == Integer.MAX_VALUE) count =-1;
        map.put(key, count);
        return count;
    }
    
    //Iterative - Bottom Up
    public int coinChange(int[] coins, int amount) {
        int[] dp =new int[amount+1];
        for(int i=1; i<=amount; ++i){
            int count = -1;
            for(int coin : coins){
                if(coin<=i && dp[i-coin] !=-1){
                    int curr = dp[i-coin]+1;
                    count = count ==-1 ? curr: Math.min(curr, count);
                }
            }
            dp[i] = count;
        }
        return dp[amount];
    }
}

