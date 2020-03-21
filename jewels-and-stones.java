class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet();
        for(Character ch : J.toCharArray()){
            set.add(ch);
        }
        int res =0;
        for(Character ch : S.toCharArray()){
            if(set.contains(ch))++res;
        }
        return res;
    }
}