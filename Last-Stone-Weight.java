class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int stone : stones) pq.add(stone);
        int res=0;
        while(pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            res = s1 -s2;
            if(res>0){
                pq.add(res);
            }
        }
        return pq.isEmpty()? res:pq.peek();
    }
}