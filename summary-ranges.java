class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        for(int i=0;i<nums.length; i++){
            int start = i;
            while( i <nums.length -1 && nums[i] +1 == nums[i+1]) i++;
            if(start == i ) res.add(nums[i]+"");
            else res.add(nums[start] +"->" + nums[i]);
        }
        return res; 
    }
}