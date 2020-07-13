class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap();
        for(String domain : cpdomains){
            String[] strs = domain.split(" ");
            int val = Integer.valueOf(strs[0]);
            String[] arr = strs[1].split("[.]");
            for(int i=0; i<arr.length; ++i){
                StringBuilder sb = new StringBuilder();
                int len = arr.length-1;
                while(len>=i){
                    sb.insert(0,arr[len--]+".");
                }
                sb.deleteCharAt(sb.length()-1);
                map.put(sb.toString(), map.getOrDefault(sb.toString(),0)+val);
            }
         }
        List<String> res = new ArrayList();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String temp = entry.getValue()+" "+entry.getKey();
            res.add(temp);
        }
        return res;
    }
}