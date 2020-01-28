class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res =0;
        int sum = 1, j=0;
        for(int i=0; i<nums.length; ++i){
            sum *= nums[i];
            while(j<=i && sum >= k) sum /=nums[j++];
            res += i-j+1;
        }
        return res;
    }
}