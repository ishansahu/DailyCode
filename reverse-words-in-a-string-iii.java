class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(String str : arr){
            if(flag) sb.append(" ");
            flag= true;
            char[] carr = str.toCharArray();
            int i=0, j=carr.length-1;
            while(i<j){
                char ch = carr[i];
                carr[i] = carr[j];
                carr[j] = ch;
                ++i; --j;
            }
            sb.append(carr);
        }
        return sb.toString();
    }
}