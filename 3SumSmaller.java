class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0; i<nums.length -1; ++i){
            int j = i+1, k=nums.length-1;
            while(k>j){
                int temp = nums[i]+nums[j]+nums[k];
                if( temp < target){
                    res +=k-j;
                    ++j;
                }else --k;
            }
            
        }
        return res;
    }
}