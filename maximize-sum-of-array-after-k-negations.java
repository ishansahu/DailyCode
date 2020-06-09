class Solution {
    public int largestSumAfterKNegations_first(int[] A, int k) {
        Arrays.sort(A);
        int i=0;
        while(k>0 && i<A.length && A[i]<0){
            A[i] = -A[i];
            --k;
            ++i;
        }
        int res =0, min = Integer.MAX_VALUE;
        for(int a :A){
            res += a;
            min = Math.min(min,a);
        } 
        return res - (k%2) * 2* min;
    }
    
    public int largestSumAfterKNegations(int[] A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int a : A) pq.add(a);
        for(int i=0; i<k; ++i) pq.add(-pq.poll());
        int res =0;
        while(!pq.isEmpty()) res +=pq.poll();
        return res;
    }
    
    
}