class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A==null || A.length ==0 || B==null || B.length == 0) return new int[0][];
        List<int[]> res = new ArrayList();
        int i=0, j=0;
        while(i <A.length && j<B.length){
            int s1 = A[i][0], e1 = A[i][1], s2 = B[j][0], e2=B[j][1];
            int start = Math.max(s1,s2);
            int end = Math.min(e1,e2);
            if(start <=end){
                res.add(new int[]{start, end});    
            }
            if (end == e1) ++i;
            else ++j;
        }
        return res.toArray(new int[res.size()][2]);
        
    }
}