class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr == null || arr.length==0) return 0;
        int n = arr.length;
        int[] up = new int[n], down = new int[n];
        down[n-1] = arr[n-1];
        for(int i = n-2; i>=0; --i){
            down[i] = Math.min(arr[i],down[i+1]);
        }
        up[0] = arr[0];
        for(int i=1;i<n;++i){
            up[i] =Math.max(up[i-1], arr[i]);
        }
        int res =1;
        for(int i=0; i<arr.length-1;++i){
            if(up[i]<down[i+1])++res;
        }
        return res;
    }
}