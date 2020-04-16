class Solution {
    public int[][] flipAndInvertImage_ori(int[][] A) {
        for(int i=0; i<A.length; ++i){
            int l =0, r=A[0].length-1;
            while(l<r){
                int start = A[i][l], end = A[i][r];
                A[i][l++] = end ==1?0:1;
                A[i][r--] = start ==1?0:1;
            }
            if(l==r) A[i][l] = A[i][l]==1?0:1;
        }
        return A;
    }
    
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int[] arr: A){
            for(int i=0; i*2 <n; ++i){
                if(arr[i] == arr[n-i-1]){
                    arr[i]  = arr[n-i-1] ^=1;
                }
            }
        }
        return A;
    }
    
}
