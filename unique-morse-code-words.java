class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] maps = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) sb.append(maps[ch-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}