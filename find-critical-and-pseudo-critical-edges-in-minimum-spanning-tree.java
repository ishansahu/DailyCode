class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Integer> critical = new ArrayList();
        List<Integer> pseudo = new ArrayList();
        
        
        Map<int[], Integer> map = new HashMap<>();
        for(int i =0;i<edges.length;i++){
            map.put(edges[i], i);
        }
        
        Arrays.sort(edges, new Comparator<int[]>(){
           @Override
            public int compare(int[] a, int[]b){
                return a[2] -b[2];
            }
        });
        
        int mincost = kruskhal_mst(n, edges, null, null);
        
        for(int i=0; i<edges.length; ++i){
            int costWithout = kruskhal_mst(n, edges, null, edges[i]);
            if(costWithout> mincost){
                critical.add(map.get(edges[i]));
            }else{
                int costWith = kruskhal_mst(n, edges, edges[i], null);
                if(costWith == mincost) pseudo.add(map.get(edges[i]));
            }
        }
        
        List<List<Integer>> res = new ArrayList();
        res.add(critical);
        res.add(pseudo);
        return res;
        
    }
    
    
    public int kruskhal_mst(int n, int[][] edges, int[] include, int[] exclude){
            
		UnionFind uf = new UnionFind(n);
		
		int res=0, count=0;
        if(include != null){
            uf.union(include[0],include[1]);
            res = include[2];
            ++count;
        }
		for(int[]edge : edges) {
			if(count == n-1) break;
			if(edge != exclude && uf.union(edge[0], edge[1])) {
				res += edge[2];
				++count;
			}
		}
		return count==n-1? res: Integer.MAX_VALUE;
    }
    
    class UnionFind{
        int[] parent;
        
        UnionFind(int n){
            parent = new int[n];
            for(int i=0; i<n;++i) parent[i] = i;
        }
        
        public int find(int x){
            return x==parent[x]?x:find(parent[x]);
        }
        
        public boolean union(int x, int y){
            int xpos = find(x);
            int ypos = find(y);
            if(xpos == ypos) return false;
            parent[ypos] = xpos;
            return true;
        }
    }
    
    
}

/*

Given an graph find the pseudo and non pseudo critical path
Define the Problem -  
    Given - undirescted graph with weight
    Requirement - find the pseudo and non pseudo edge
    
-Cover Edge cases
    weights cannot be negative
    no duplicate pair
    
- Approach
    1. find all the MST and compare the edges in each tree
        Find the mst using kruskal algo using disjoint set to check if any cycle occurs or not
        To find the critical path remove the edge and rerun the MST, if weight increases that means its a pseudo edge otherwise a non psuedo edge
        
 - Algo
 
 
    
*/