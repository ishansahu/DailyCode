class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        for(; i<nums.length; ++i){
            if(nums[i]==0)continue;
            nums[j++] = nums[i];
        }
        while(j<nums.length) nums[j++]=0;
    }
}