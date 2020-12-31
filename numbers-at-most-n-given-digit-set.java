class Solution {
    
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s = String.valueOf(n);
        int k = s.length();
        int[] dp = new int[k+1];
        dp[k] = 1;
        for(int i= k-1; i>=0; --i){
            int curr = s.charAt(i)-'0';
            for(String dig : digits){
                if(Integer.valueOf(dig)<curr){
                    dp[i] += Math.pow(digits.length,k-i-1); 
                }else if(Integer.valueOf(dig)==curr){
                    dp[i]+=dp[i+1];
                }
            }    
        }
        for(int i=1; i<k; ++i){
            dp[0] +=Math.pow(digits.length, i);
        }
        return dp[0];
    }
    
    
    
    int res;
    public int atMostNGivenDigitSet_brute(String[] digits, int n) {
        res = 0;
        Arrays.sort(digits);
        helper(digits, 0, new StringBuilder(), n);
        return res;
    }
    
    public void helper(String[] digits,int idx, StringBuilder sb, int n){
        if(sb.length()>0 && Long.valueOf(sb.toString()) >n) return ;
        for(int i =0; i<digits.length;++i){
            sb.append(digits[i]);
            if(Long.valueOf(sb.toString())>n){
                sb.deleteCharAt(sb.length()-1);
                return ;  
            } 
            ++res;
            helper(digits, i, sb, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}