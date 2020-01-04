class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        char[] ch = S.toCharArray();
        for(int i=0; i <ch.length; i++ ){
            if(!st.empty() && ch[i] == st.peek())
                    st.pop();
            else 
                st.push(ch[i]);
        }
        StringBuilder str = new StringBuilder();
        for(char c : st){
            str.append(c);
        }
        return str.toString();
    }
}