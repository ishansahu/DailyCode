class Solution {
    int count=0;
    boolean flag = false;
    public String getHappyString(int n, int k) {
        char[] carr = new char[]{'a', 'b','c'};
        List<String> res = new ArrayList();
        helper(res, new ArrayList<Character>(), carr,n, k);
        return flag == true ? res.get(k-1) :"";
    }
    
    public void helper(List<String> res, List<Character> temp,char[] carr,int n, int k){
        if(temp.size() == n){
            ++count;
            if(count == k ) flag = true;
            String str = temp.toString().substring(1, 3 * temp.size() - 1).replaceAll(", ", "");
            res.add(str);
            return;
        }
        for(int j=0; j<3; ++j){
                char ch = carr[j%3];
                if(temp.size()>0 && temp.get(temp.size()-1) == ch) continue;
                temp.add(ch);
                helper(res, temp, carr, n, k);
                if(flag) return;
                temp.remove(temp.size()-1);
        }
        
        
    }
}