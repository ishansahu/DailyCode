class Solution {
    public int missingNumber_mysol(int[] nums) {
        boolean[] dup = new boolean[nums.length];
        for(int i=0; i< nums.length; i++){
            if(nums[i] < nums.length) dup[nums[i]] = true;
        }
        for(int i=0; i< nums.length; i++){
            if(!dup[i]) return i;
        }
        return nums.length;
    }
    
    public static int missingNumber(int[] nums) {
      int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res = res ^ i ^ nums[i]; // a^b^b = a
    }
    return res;
}
}