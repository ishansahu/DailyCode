class Solution {

    int[] pre_sum;
    int sum;
    public Solution(int[] w) {
        pre_sum = new int[w.length];
        sum = 0;
        for(int i=0; i<w.length; ++i){
            sum +=w[i];
            pre_sum[i] = sum;
            
        }
    }
    
    public int pickIndex() {
        double range = (Math.random()*sum);
        int l=0, r= pre_sum.length;
        while(l<r){
            int mid = l + (r-l)/2;
            if(pre_sum[mid]< range) l = mid+1;
            else r = mid;
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */