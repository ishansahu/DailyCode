class Solution {
    public boolean wordBreak_brute(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet(wordDict);
        return helper(s, set);
    }
    
    public boolean helper(String s, HashSet<String> set){
        int n = s.length();
        if (n == 0) {
            return true;
        }
        
        for(int i=1; i<=n; ++i){
            if(set.contains(s.substring(0,i)) && helper(s.substring(i,n), set)) return true;
        }
        return false;
    }
    
    
    //memoization
    public boolean wordBreak_memo(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet(wordDict);
        HashMap<String, Boolean> map = new HashMap();
        return memoization(s, set,map);
    }
    
    public boolean memoization(String s, HashSet<String> set,HashMap<String, Boolean> map){
        if(map.containsKey(s)) return map.get(s);
        int n = s.length();
        if(set.contains(s)) return true;
        for(int i=1; i<n; ++i){
            if(set.contains(s.substring(0,i)) && memoization(s.substring(i,n), set, map)){
                map.put(s, true);
                return true;  
            } 
        }
        map.put(s, false);
        return false;
    }
    
    //iterative
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet(wordDict);
        int n = s.length();
        boolean[] dp= new boolean[n+1];
        dp[0] = true;
        
        for(int i=1; i<=n;++i){
            for(int j=0; j<i;++j){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    
}