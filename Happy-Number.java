class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        set.add(n);
        while(true){
            int temp=0;
            while(n>0){
                temp+=Math.pow(n%10,2);
                n/=10;
            }
            if(temp == 1) return true;
            if(set.contains(temp)) return false;
            set.add(temp);
            n=temp;
        }
    }
}