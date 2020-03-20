class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0; i<nums.length; ++i){
            temp = Math.max(nums[i] , temp+nums[i]);
            res = Math.max(res, temp);
        }
        return res;
    }
}