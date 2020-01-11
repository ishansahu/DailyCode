class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())  return false;
        if(A.equals(B)){
            HashSet<Character> set = new HashSet<Character>();
            for(int i=0;i<A.length();++i)
                set.add(A.charAt(i));
            return set.size() < A.length();
        }
        int count =0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<A.length();++i){
            if(A.charAt(i) != B.charAt(i)){
                ++count;
                list.add(i);
            }
        }
        return count == 2 && A.charAt(list.get(0)) == B.charAt(list.get(1)) && A.charAt(list.get(1)) == B.charAt(list.get(0));
        
    }
}