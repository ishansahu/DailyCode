class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0], min = A[0];
        for(int i=1; i<A.length; ++i){
            max = Math.max(max, A[i]);
            min = Math.min(min,A[i]);
        }
        int res = max-K - (min+K);
        return res>0?res:0;
    }
}