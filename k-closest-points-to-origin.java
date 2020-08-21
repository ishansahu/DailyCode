class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1,p2)-> p2[0]*p2[0]+p2[1]*p2[1]- p1[0]*p1[0]-p1[1]*p1[1]);
        for(int[] point: points){
            pq.add(point);
            if(pq.size()>K) pq.poll();
        }
        int res[][] = new int[K][2];
        int i=0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll();
        }
        return res;
    }
}