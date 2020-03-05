class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String>res = new ArrayList();
        helper(S.toCharArray(), res, 0);
        return res;
    }
    
    public void helper(char[] ch, List<String> res, int l){
        if(l==ch.length){
            res.add(new String(ch));
            return;
        }
        if(ch[l]>= '0' && ch[l]<='9'){
            helper(ch, res, l+1);
            return;
        }
        ch[l] = Character.toLowerCase(ch[l]);
        helper(ch, res, l+1);
        ch[l] = Character.toUpperCase(ch[l]);
        helper(ch, res, l+1);
    }
}