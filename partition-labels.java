class Solution {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i<S.length(); ++i){
            map.put(S.charAt(i), i);
        }
        List<Integer> res = new ArrayList();
        int j=0, k=0;
        for(int i=0; i<S.length(); i++){
            j = Math.max(j,map.get(S.charAt(i)));
            if(i==j){
                res.add(j-k+1);
                k=i+1;
            }
        }
        return res;
    }
}