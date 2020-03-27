class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start =0, end =0, res =Integer.MAX_VALUE, sum=0;
        while(end<nums.length){
            sum += nums[end++];
            while(sum >= s){
                res = Math.min(res, end-start);
                sum -= nums[start++];
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }
}