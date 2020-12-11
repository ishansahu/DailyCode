class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1, j=n-i-1; i<n;++i, --j){
            left[i] = i%k==0?nums[i]: Math.max(nums[i],left[i-1]);
            right[j] = j%k==0?nums[j]:Math.max(nums[j],right[j+1]);
        }
        int[] res = new int[n-k+1];
        for(int i=0, j=0;i+k<=n; ++i){
            res[j++] = Math.max(left[i+k-1],right[i]);
        }
        
        return res;
    }
}