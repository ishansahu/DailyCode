class Solution {
    public String convert(String s, int numRows) {
        if(s == null || s.length() ==0) return new String();
        List<Character>[] larr = new List[numRows];
        for(int p =0; p<numRows; ++p){
            larr[p] = new ArrayList();
        }
        int i=0;
        int pos =0;
        boolean flag = false;
        while(i<s.length()){
            if(pos == -1) pos =0;
            larr[pos].add(s.charAt(i));
            if(pos ==0) flag = false;
            if(pos == numRows-1) flag = true;
            if(flag) --pos;
            else ++pos;
            ++i;
        }
        StringBuilder sb = new StringBuilder();
        for(int k= 0; k<numRows; ++k){
            for(int j=0; j<larr[k].size();++j){
                sb.append(larr[k].get(j));
            } 
        }
        return sb.toString();
    }
}