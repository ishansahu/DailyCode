class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; ++i){
            if(i==0 ||(i>0 && nums[i] != nums[i-1])){
                int l = i+1, r = nums.length-1;
                while(l<r){
                    int curr = nums[i] + nums[l] + nums[r];
                    if(curr == target) return target;
                    if(Math.abs(curr-target) <Math.abs(target-closest)) closest = curr;
                    if(curr<target){
                        ++l;
                    }else{
                        --r;
                    }
                }    
            }
            
        }
        return closest;
    }
}