class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet();
        for(int a : A){
            if(set.contains(a)) return a;
            set.add(a);
        }
        throw null;
    }
}