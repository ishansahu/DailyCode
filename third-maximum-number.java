class Solution {
    public int thirdMax(int[] nums) {
        long t1 = Long.MIN_VALUE,t2=Long.MIN_VALUE,t3=Long.MIN_VALUE;
        for(int i=0; i<nums.length ;i++){
            if(nums[i] > t1){
                t3 = t2;
                t2 = t1;
                t1 = nums[i];
            }else if(nums[i] > t2 && nums[i] <t1){
                t3 = t2;
                t2 = nums[i];
            }else if(nums[i] > t3 && nums[i] <t2) t3 = nums[i];
        }
        return (int)((t3 > Long.MIN_VALUE) ? t3 : t1);
        
    }
}