class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList(), res);    
        return res;
    }
    
    public void helper(int[] candidates, int target, int idx, List<Integer> lst, List<List<Integer>> res){
        if(target<0) return;
        else if(target == 0){
            res.add(new ArrayList(lst));
        }else{
            for(int i=idx; i<candidates.length; ++i){
                lst.add(candidates[i]);
                helper(candidates, target-candidates[i], i, lst, res);
                lst.remove(lst.size()-1);
            }    
        }
        
    }
}