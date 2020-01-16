class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(res, "", s,0);
        return res;
    }
    
    public void helper(List<String> res, String path, String s, int pos){
        if(s.isEmpty() || pos == 4){
            if(s.isEmpty() && pos == 4) 
                res.add(path.substring(1));
            return;
        }  
        for(int i=1; i<= (s.charAt(0) == '0'? 1 : 3 ) && i<=s.length() ;i++){
            String temp = s.substring(0,i);
            
            if (Integer.valueOf(temp) <= 255) 
            helper(res, path + "." + temp,s.substring(i), pos+1);
        }
    }
}