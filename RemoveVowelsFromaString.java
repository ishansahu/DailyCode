class Solution {
    public String removeVowels_mysol(String s) {
        HashSet<Character> set = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<str.length(); ){
            if(set.contains(str.charAt(i))){
                str.deleteCharAt(i);
            }else i++;
                
        }
        return str.toString();
    }
    
    public String removeVowels(String s) {
        return s.replaceAll("[aeiou]","");
    }
}