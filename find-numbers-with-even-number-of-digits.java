class Solution {
    public int findNumbers_mysol(int[] nums) {
        int res=0;
        for(int n : nums){
            int count=0;
            while(n>0){
                ++count;
                n/=10;
            }
            if(count %2 ==0) res++;
        }
        return res;
    }
    
    public int findNumbers(int[] nums) {
        int res=0;
        for(int n : nums){
            if((n>9 && n<100) ||  (n>999 && n<10000))res++;
        }
        return res;
    }
}