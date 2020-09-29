class Solution {
    public int findCircleNum_unionFind(int[][] M) {
        int n = M.length;
        int[] parent = new int[n];
        Arrays.fill(parent,-1);
        for(int i=0; i<n; ++i){
            for(int j=0; j<i; ++j){
               if(M[i][j]==1) union(parent, i, j); 
            }
        }
        int res =0;
        for(int num : parent) if(num == -1) ++res;
        return res;
    }
    public int find(int[] parent, int i){
        if(parent[i]== -1) return i;
        return find(parent, parent[i]);
    }
    public void union(int[] parent, int x, int y){
        int xpos = find(parent, x);
        int ypos = find(parent, y);
        
        if(xpos == ypos) return;
        
        parent[xpos] = ypos;
    }
    
    
    public int findCircleNum(int[][] M){
        int n = M.length;
        int[] visited = new int[n];
        int res=0;
        for(int i=0; i<n; ++i){
            if(visited[i] ==0){
                dfs(M, visited, i);
                ++res;
            }
        }
        return res;
    }
    
    public void dfs(int[][] M, int[] visited, int curr){
        visited[curr] = 1;
        for(int j=0; j<M.length; ++j){
            if(M[curr][j] == 1 && visited[j] !=1){
                dfs(M, visited, j);
            }
        }
    }
    
    
}