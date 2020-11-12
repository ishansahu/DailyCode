class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, String> parent = new HashMap();
        HashMap<String, String> owner = new HashMap();
        HashMap<String, TreeSet<String>> union = new HashMap();
        
        for(List<String> acc : accounts){
            for(int i=1; i<acc.size(); ++i){
                parent.put(acc.get(i),acc.get(i));
                owner.put(acc.get(i), acc.get(0));
            }
        }
        
        for(List<String> acc : accounts){
            String p = find(acc.get(1), parent);
            for(int i=2;i<acc.size();++i){
                parent.put(find(acc.get(i), parent),p);
            }
        }
        
        for(List<String> acc: accounts){
            String p = find(acc.get(1),parent);
            if(!union.containsKey(p)) union.put(p, new TreeSet());
            for(int i=1;i<acc.size();++i){
                union.get(p).add(acc.get(i));
            }
        }
        
        List<List<String>> res = new ArrayList();
        for(String p : union.keySet()){
            List<String> curr = new ArrayList(union.get(p));
            curr.add(0,owner.get(p));
            res.add(curr);
        }
        return res;
    }
    
    public String find(String s, HashMap<String, String> parent){
        return parent.get(s) == s ? s : find(parent.get(s), parent);
        //return s.equals(parent.get(s))? s: find(parent.get(s),parent);
    }
}