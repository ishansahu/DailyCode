class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        helper(n,k, 1, new ArrayList(), res);
        return res;
    }
    
    public void helper(int n, int k, int ind, ArrayList<Integer> lst, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList(lst));
        }else{
            for(int i= ind; i<=n-k+1; ++i){
                lst.add(i);
                helper(n, k-1, i+1, lst, res);
                lst.remove(lst.size()-1);
            }    
        }
    }
}