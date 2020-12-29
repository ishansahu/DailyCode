class Solution {

    HashMap<Integer, Integer> map;
    int n, m;
    public Solution(int N, int[] blacklist) {
        map = new HashMap();
        for(int b : blacklist) map.put(b,-1);
        n = N;
        m = n-blacklist.length;
        for(int b : blacklist){
            if(b<m){
              while(map.containsKey(n-1)) --n;
                map.put(b,n-1);
                n--;  
            } 
        } 
        
    }
    public int pick() {
        int rand = (int)(Math.random()*m);
        if(map.containsKey(rand)) return map.get(rand);
        return rand;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(N, blacklist);
 * int param_1 = obj.pick();
 */