class HitCounter {

    /** Initialize your data structure here. */
    PriorityQueue<Integer> pq;
    public HitCounter() {
        pq = new PriorityQueue<>((A,B) -> A-B);
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        pq.add(timestamp);
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        if(timestamp <= 300) return pq.size();
        //System.out.println(pq.peek());
        while(pq.size() > 0 && pq.peek() <= timestamp - 300) pq.poll();
        return pq.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */