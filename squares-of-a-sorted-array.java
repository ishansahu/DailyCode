class Solution {
    public int[] sortedSquares(int[] A) {
        int j=0, i=0;
        while(j <A.length && A[j]<0 ) ++j;
        int[] res = new int[A.length];
        int k =0;
        i=j-1;
        while(i >= 0 && j < A.length){
            if(Math.abs(A[i])<A[j]){
                res[k] = A[i]*A[i];
                --i;
            }else{
                res[k] = A[j]*A[j];
                ++j;
            }
            ++k;
        }
        while (i >= 0) {
            res[k++] = A[i] * A[i];
            i--;
        }
        while (j < A.length) {
            res[k++] = A[j] * A[j];
            j++;
        }
        return res;
    }
}