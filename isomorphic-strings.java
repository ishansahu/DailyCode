class Solution {
    public boolean isIsomorphic_1(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        for(int i=0; i<s.length(); ++i){
            char src = s.charAt(i), trg = t.charAt(i);
            if(map.containsKey(src)){
                if(map.get(src) != trg) return false;
            }else{
                if(map.containsValue(trg)) return false;
            }
            map.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
    
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[512];
        for(int i=0; i<s.length(); ++i){
            if(arr[s.charAt(i)] != arr[t.charAt(i)+256]) return false;
            arr[s.charAt(i)] = arr[t.charAt(i)+256] = i+1;
        }
        return true;
    }
}