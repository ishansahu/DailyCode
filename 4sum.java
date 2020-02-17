class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        for(int i=0; i<nums.length-3;++i){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; ++j){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int twoSumTarget = target - nums[i] - nums[j];
                int m = j+1, n = nums.length-1;
                while(m<n){
                    int twoSum = nums[m] + nums[n];
                    if(twoSum < twoSumTarget){
                        while(m < n && nums[m] == nums[m+1]) m++;
                        m++;
                    }else if(twoSum > twoSumTarget){
                        while(m < n && nums[n] == nums[n-1]) n--;
                        n--;
                    }else{
                        List<Integer> tempList = new LinkedList<>(Arrays.asList(nums[i],nums[j],nums[m],nums[n]));
                        res.add(tempList);
                        while(m < n && nums[m] == nums[m+1]) m++;
                        m++;
                        while(m < n && nums[n] == nums[n-1]) n--;
                        n--;
                    }
                }
            }
        }
        return res;
    }
}