class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        HashMap<Integer, List<int[]>> graph = new HashMap();
        for(int[] flight : flights){
            List<int[]> temp = graph.get(flight[0]);
            if(temp == null) temp = new ArrayList();
            temp.add(new int[]{flight[1], flight[2]});
            graph.put(flight[0], temp);
        }
        int res = Integer.MAX_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue( new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
              return a[0] -b[0];  
            }
        });
        pq.add(new int[]{0, src, K+1});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int dist = curr[0];
            int vertex = curr[1];
            int stop = curr[2];
            if(vertex == dst) return dist;
            if(stop >0){
                List<int[]> adjacent = graph.get(vertex);
                if (adjacent== null) continue;
                for(int i=0; i<adjacent.size(); ++i){
                    pq.add(new int[]{dist + adjacent.get(i)[1], adjacent.get(i)[0], stop -1 });
                }
            }
        }
        return -1;
     }
}