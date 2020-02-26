class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[61];
        int res=0;
        for(int i=0; i<time.length;++i) ++arr[time[i]%60];
        for(int i = 1; i < 30; i++){
            res += arr[i] * arr[60 - i];
        }
        res += arr[0] * (arr[0] - 1)/2;
        res += arr[30] * (arr[30] - 1)/2;
        return res;
    }
}