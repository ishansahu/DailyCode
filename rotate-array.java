class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        helper(nums, 0, nums.length-1);
        helper(nums, k, nums.length-1);
        helper(nums, 0, k-1);
    }
    
    public void helper(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            ++l;--r;
        }
    }
}