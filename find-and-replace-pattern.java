class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        String str = helper(pattern);
        for(String word : words){
            if(str.equals(helper(word))) res.add(word);
        }
        return res;
    }
    
    public String helper(String pattern){
        HashMap<Character, Integer> map = new HashMap();
        StringBuilder sb = new StringBuilder();
        for(char ch : pattern.toCharArray()){
            map.putIfAbsent(ch, map.size());
            sb.append(map.get(ch));
        }
        return sb.toString();
    }
}