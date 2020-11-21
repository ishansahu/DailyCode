class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> lst = new ArrayList();
        helper(res, lst, n,k,1);
        return res;
    }
    
    
    public void helper(List<List<Integer>> res, List<Integer> lst, int n, int k, int idx){
        if(k==0 && n==0) res.add(new ArrayList(lst));
        else{
            for(int i=idx; i<=9-k+1; ++i){
                if(n-i<0)break;
                lst.add(i);
                helper(res, lst, n-i, k-1, i+1);
                lst.remove(lst.size()-1);
            }
        }
    }
}