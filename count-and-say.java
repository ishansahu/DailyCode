class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i=1; i<n; ++i){
            char[] ch = res.toCharArray();
            StringBuilder sb = new StringBuilder();
            int index=0;
            while(index < ch.length){
                char curr = ch[index];
                int count = 0;
                while(index < ch.length && ch[index] == curr){
                    ++index;
                    ++count;
                }
                sb.append(count);
                sb.append(curr);
            }
            res = sb.toString();
        }
        return res;
    }
}