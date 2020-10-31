class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<Integer>[] graph = new ArrayList[N];
        for(int i=0;i<N;++i)graph[i] = new ArrayList();
        for(int[] node : dislikes){
            graph[node[0]-1].add(node[1]-1);
            graph[node[1]-1].add(node[0]-1);
        }
        int[] color = new int[N];
        for(int i=0; i<N;++i){
            if(color[i] == 0 && !dfs(graph, color, i, 1)) return false;
        }
        return true;
    }
    
    public boolean dfs(List<Integer>[] graph, int[] color, int node, int c){
        if(color[node] !=0) return color[node] ==c;
        color[node]=c;
        for(int i=0;i<graph[node].size(); ++i){
            if(color[graph[node].get(i)] == c || !dfs(graph, color, graph[node].get(i), -c)) return false;
        }
        return true;
    }
    
    
    
}