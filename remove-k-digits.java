class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() ==k) return "0";
        int i=0;
        Stack<Character> st = new Stack();
        while(i<num.length()){
            char ch = num.charAt(i);
            while(k>0 && !st.isEmpty() && st.peek() > ch){
                st.pop();
                --k;
            }
            st.push(ch);
            ++i;
        }
        while(k>0 ){
            st.pop();
            --k;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}