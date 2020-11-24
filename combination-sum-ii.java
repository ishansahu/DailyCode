class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList();
        helper(res, new ArrayList(), target, 0, candidates);
        return res;
    }
    
    public void helper(List<List<Integer>> res, ArrayList<Integer> lst, int target, int idx, int[] candidates){
        if(target == 0) res.add(new ArrayList(lst));
        else{
            for(int i= idx; i< candidates.length ;++i){
                if(target-candidates[i]<0) break;  
                if(i>idx && candidates[i-1] == candidates[i]) continue;
                lst.add(candidates[i]);
                helper(res, lst, target-candidates[i], i+1,candidates);
                lst.remove(lst.size()-1);
            }
        }
    }
}