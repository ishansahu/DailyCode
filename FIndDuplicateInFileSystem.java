class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : paths){
            String[] splits = s.split(" ");
            for(int i =1 ; i<splits.length; i++){
                int start = splits[i].indexOf('(');
                int end = splits[i].indexOf(')');
                String file = splits[i].substring(start,end);
                
                List<String> ls = map.getOrDefault(file, new ArrayList<String>());
                ls.add(splits[0] + "/" + splits[i].substring(0, start));
                map.put(file, ls);
            }
        }
            List<List<String>> output = new ArrayList<>();
            for(String key : map.keySet()){
                if(map.get(key).size()>1)
                    output.add(map.get(key));
            }
            return output;
    }
}