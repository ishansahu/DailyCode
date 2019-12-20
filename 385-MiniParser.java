/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        if(s == null) return new NestedInteger();
        if(s.charAt(0) !='[') return new NestedInteger(Integer.valueOf(s));
        NestedInteger res=null;
        Stack<NestedInteger> stack = new Stack<>();
        int st=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                if(res!= null){
                    stack.push(res);
                }
                res = new NestedInteger();
                st = i+1;
            }else if(ch == ']'){
                String str = s.substring(st,i);
                if(!str.isEmpty()) res.add(new NestedInteger(Integer.valueOf(str)));
                st=i+1;
                if(!stack.isEmpty()){
                    NestedInteger temp = stack.pop();
                    temp.add(res);
                    res = temp;
                }
            }else if(ch == ','){
                if(s.charAt(i-1) !=']'){
                    String str = s.substring(st,i);
                    res.add(new NestedInteger(Integer.valueOf(str)));
                }
                st =i+1;
            }
        }
        return res;
    }
}