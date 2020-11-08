class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int s, int e){
        int[] res = helper1(nums, s, e);
        return Math.max(res[0], res[1]);
    }
    
    public int[] helper1(int[] nums, int s, int e){
        if(e<s) return new int[2];
        int[] prev =helper1(nums, s, e-1);
        int[] res = new int[2];
        res[0] = Math.max(prev[0], prev[1]);
        res[1] = nums[e] + prev[0];
        return res;
    }
}