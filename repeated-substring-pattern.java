class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len/2; i>0;--i){
            if(len%i ==0){
                int m = len/i;
                String temp = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<m; ++j){
                    sb.append(temp);
                }
                if(s.equals(sb.toString())) return true;
            }
        }
        return false;
    }
}