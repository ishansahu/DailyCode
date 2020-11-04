class Solution {
    public boolean isBipartite_unionFind(int[][] graph) {
        UnionFind uf = new UnionFind(graph.length);
        for(int i=0;i<graph.length; ++i){
            for(int j=0; j<graph[i].length;++j){
                if(uf.find(i)==uf.find(graph[i][j])) return false;
                uf.union(graph[i][0],graph[i][j]);
            }
        }
        return true;
    }
    
    class UnionFind{
        int[] parent;
        public UnionFind(int n){
            parent = new int[n];
            for(int i=0; i<n; ++i) parent[i]=i;
        }
        
        public int find(int x){
            return parent[x]==x?x:find(parent[x]);
        }
        
        public void union(int x, int y){
            int xPos = find(x);
            int yPos = find(y);
            if(xPos == yPos) return;
            parent[yPos] = xPos;
        }
        
    }
    
    public boolean isBipartite_dfs(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0;i<n; ++i){
            if(color[i]==0 && !dfs(graph, color, 1, i)) return false; 
        }
        return true;
    }
    
    public boolean dfs(int[][] graph, int[] color, int c, int node){
        if(color[node] !=0) return color[node]==c;
        color[node] = c;
        for(int v : graph[node]){
            if(!dfs(graph, color, -c, v)) return false;
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0;i<n;++i){
            if(color[i] !=0) continue;
            Queue<Integer> queue = new LinkedList();
            color[i] = 1;
            queue.add(i);
            while(!queue.isEmpty()){
                int curr = queue.poll();
                for(int  next: graph[curr]){
                    if(color[next] ==0){
                        color[next] = -color[curr];
                        queue.add(next);
                    }else{
                        if(color[next] == color[curr]) return false;
                    }
                }
            }
        }
        return true;
        
    }
    
}