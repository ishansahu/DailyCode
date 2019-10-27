class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph +=".";
        HashSet<String> set = new HashSet<>();
        for(String s: banned){
            set.add(s.toLowerCase());
        }
        HashMap<String,Integer> map = new HashMap<>();
        String res= "";
        int count =0;
        StringBuilder str = new StringBuilder();
        for(Character c : paragraph.toCharArray()){
            if(Character.isLetter(c)){
                str.append(Character.toLowerCase(c));
            }else if(str.length()>0){
                String finalword = str.toString();
                if(!set.contains(finalword)){
                    map.put(finalword, map.getOrDefault(finalword,0)+1);
                    if (map.get(finalword)> count){
                        res = finalword;
                        count = map.get(finalword);
                    }
                }
                str = new StringBuilder();
            }
        }
        return res;
    }
}