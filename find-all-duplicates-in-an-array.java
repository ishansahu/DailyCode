class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        for(int num : nums){
            nums[Math.abs(num)-1] *=-1; 
        }
        for(int num : nums){
            if(nums[Math.abs(num)-1] >0){
                res.add(Math.abs(num));
                nums[Math.abs(num)-1] *=-1;
            }
        }
        return res;
    }
}