class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x!=0){
            res *=10;
            res += (x%10);
            x/=10;
        }
        return (int)res == res?(int) res:0;
    }
   
    public int reverse_bakwaas(int x) {
        String str = String.valueOf(x);
        if(str.charAt(0)=='-') return (-1)* helper(str.substring(1,str.length()));
        else return helper(str);
    }
    public int helper(String num){
        Long max = Long.valueOf(Integer.MAX_VALUE);
        char[] ch = num.toCharArray();
        int l=0, r=ch.length-1;
        while(l<r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            ++l;--r;
        }
        Long res = Long.valueOf(String.valueOf(ch));
        return res> max? 0: Integer.valueOf(String.valueOf(ch));
    }
}