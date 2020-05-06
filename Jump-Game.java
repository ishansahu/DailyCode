class Solution {
    public boolean canJump(int[] nums) {
        return helper(nums, 0);
    }
    
    public boolean helper(int[] nums, int index){
        if(index >= nums.length-1) return true;
        while(nums[index] >0){
            if (helper(nums, index + nums[index]--)) return true;
        }
        return false;
    }
}