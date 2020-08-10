class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int num: nums) sum +=num;
        List<Integer> res = new ArrayList();
        int min_sum = 0, ind = nums.length -1;
        while(ind >=0 && min_sum<=sum){
            min_sum += nums[ind];
            sum -= nums[ind];
            res.add(nums[ind]);
            --ind;
        }
        return res;
    }
}