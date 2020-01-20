class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i=0,j=0;
        int startmax, endmin;
        List<int[]> res = new ArrayList<>();
        while(i<A.length && j<B.length){
            startmax = Math.max(A[i][0], B[j][0]);
            endmin = Math.min(A[i][1], B[j][1]);
            if(endmin >= startmax){
                res.add(new int[]{startmax,endmin});
            }
            if(A[i][1] == endmin) i++;
            if(B[j][1] == endmin) j++;
        }
        return res.toArray(new int[res.size()][2]);
    }
}