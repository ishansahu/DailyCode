class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        helper(res, new ArrayList(), nums,0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> temp,int[] nums,int pos ){
        res.add(new ArrayList<>(temp));
        for(int i=pos; i<nums.length;++i ){
            temp.add(nums[i]);            
            helper(res, temp, nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    
}