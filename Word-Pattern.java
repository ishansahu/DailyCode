class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap();
        String[] str1 = str.split(" ");
        if(str1.length != pattern.length()) return false;
        for(int i=0; i<str1.length; ++i){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(str1[i]))
                    return false;
            }else{
                if(map.containsValue(str1[i])) return false;
                map.put(pattern.charAt(i), str1[i]);
            } 
        }
        return true;
    }
}