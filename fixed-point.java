class Solution {
    public int fixedPoint(int[] A) {
        for(int i=0;i<A.length;++i){
            if(A[i]==i) return i;
            if(A[i]>i) return -1;
        }
        return -1;
    }
}