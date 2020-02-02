class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        for(int i=0; i<s.length(); ++i){
            if(map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i)) !=s.charAt(i))  return false;
            } 
            else{
                 if (map.containsValue(s.charAt(i))) return false;
                map.put(t.charAt(i),s.charAt(i));
            } 
        }
        return true;
    }
}