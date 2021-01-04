class Solution {
    public int longestMountain_2pass(int[] A) {
        if(A == null) return 0;
        int res =0, n = A.length;
        int[] asc_arr = new int[n], desc_arr = new int[n];
        for(int j=n-2; j>=0;--j){
            if(A[j]>A[j+1]) desc_arr[j] = desc_arr[j+1]+1;
        }
        for(int i=1; i<n; ++i){
            if(A[i]>A[i-1]) asc_arr[i] = asc_arr[i-1]+1;
            if(asc_arr[i]>0 && desc_arr[i]>0) res = Math.max(res,asc_arr[i]+desc_arr[i]+1);
        }
        return res;
    }
    
    public int longestMountain(int[] A) {
        if(A== null) return 0;
        int up=0, down=0, res =0;
        for(int i=1;i<A.length; ++i){
            if(down >0 && A[i-1]<A[i] || A[i-1] == A[i]) up=down=0;
            if(A[i]>A[i-1]) ++up;
            else if(A[i]<A[i-1])++down;
            if(up>0 && down>0) res = Math.max(res, up+down+1);
        }
        return res;
    }
}