class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, end =-2, start =-1, max = nums[0], min = nums[len-1];
        for(int i=1; i<len ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[len -1-i]);
            if(max > nums[i]) end = i;
            if(min < nums[len -1 -i]) start = len -1-i;
        }
        
        return end - start +1;
    }
}