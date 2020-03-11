class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        helper(res, new ArrayList(), nums, new boolean[nums.length]);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] visit){
        if(temp.size() == nums.length){
            res.add(new ArrayList(temp));
        }else{
            for(int i=0; i<nums.length; ++i){
                if(visit[i] || i>0 && nums[i] == nums[i-1] && !visit[i-1]) continue;
                visit[i] =true;
                temp.add(nums[i]);
                helper(res, temp, nums,visit);
                temp.remove(temp.size()-1);
                visit[i] =false;
            }    
        }
        
    }
}