class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null || s.length() ==0) return s;
        Stack<String> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch =='('){
                stack.push(sb.toString());
                sb = new StringBuilder();
            }else if(ch == ')'){
                if(stack.isEmpty()) continue;
                String st = stack.pop()+'(' + sb.toString() + ')';
                sb =  new StringBuilder(st) ;
            }else{
                sb.append(ch);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while(!stack.isEmpty()) sb1.insert(0, stack.pop());
        sb1.append(sb);
        return sb1.toString();
    }
}