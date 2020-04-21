class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int card : deck) map.put(card, map.getOrDefault(card,0)+1);
        int mincount = 0;
        for(int i  : map.values()){
            mincount = gcd(mincount, i);
        }
        return mincount>1;
    }
    
    public int gcd(int mincount, int num){
        return mincount == 0? num: gcd(num%mincount, mincount);
    }
}