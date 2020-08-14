class Solution {
    public int minAddToMakeValid(String S) {
        int stack = 0, count =0;
        for(char ch : S.toCharArray()){
            if(ch =='('){
                ++stack;
            }else{
                if(stack==0) ++count;
                else --stack;  
            } 
        }
        return count + stack;
    }
}