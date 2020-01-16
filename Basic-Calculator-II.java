class Solution {
    public int calculate(String s) {
        if(s == null || s.length() ==0) return 0;
        int len = s.length();
        Stack<Integer> st = new Stack<>();
        char sign = '+';
        int num =0;
        for(int i=0; i<len;i++){
            if(Character.isDigit(s.charAt(i)))
                num = num * 10 + s.charAt(i)-'0';
            if((!Character.isDigit(s.charAt(i)) &&s.charAt(i) != ' ') || i==len -1){
                if(sign == '+') st.push(num);
                else if(sign == '-') st.push(-num);
                else if(sign == '*') st.push(st.pop() * num);
                else if(sign == '/') st.push(st.pop() / num);
                sign = s.charAt(i);
                num =0;
            }
        }
        num =0;
        while(!st.isEmpty()){
            num += st.pop();
        }
        return num;
    }
}