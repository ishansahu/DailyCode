class Solution {
    public int numTilePossibilities_improved(String tiles) {
        int[] arr = new int[26];
        for(char ch : tiles.toCharArray()) ++arr[ch -'A'];
        return helper(arr);
            
    }
    
    public int helper(int[] arr){
        int sum =0;
        for(int i=0; i<26; ++i){
            if(arr[i] ==0) continue;
            ++sum;
            --arr[i];
            sum +=helper(arr);
            ++arr[i];
        }
        return sum;
    }
    
    int count;
    public int numTilePossibilities(String tiles) {
        count = 0;
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];
        dfs(chars, 0, visited);
        return count;
    }
    
    private void dfs(char[] chars, int length, boolean[] visited){
        if(length == chars.length) return;
        for(int i = 0; i < chars.length; i++){
            if(visited[i]) continue;
            if(i - 1 >= 0 && chars[i] == chars[i - 1] && !visited[i - 1]) continue;
            count ++;
            visited[i] = true;
            dfs(chars, length + 1, visited);
            visited[i] = false;
        }
    }
}