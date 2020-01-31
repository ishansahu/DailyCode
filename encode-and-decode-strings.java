public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs == null || strs.size()==0  ) return "";
        char ch = 'œ';
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            if(s.length() ==0) s="∑";
            res.append(s+ch);            
        } 
        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s == null || s.length()==0) return new ArrayList<String>();
        List<String> res = new ArrayList();
        for(String str : s.split("œ")){
            if(str.equals("∑")) str="";
            res.add(str);
        }
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));