class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length ==0 ) return 0;
        int start=timeSeries[0], end = timeSeries[0] + duration, res=0;
        for(int i =1; i<timeSeries.length; ++i){
            if(end<timeSeries[i]){
                res += end -start;
                start = timeSeries[i]; 
            }
            end = timeSeries[i]+duration;
        }
        res += end-start;
        return res;
    }
    public int findPoisonedDuration_old(int[] timeSeries, int duration) {
        int start=0, res=0;
        for(int i =0; i<timeSeries.length; ++i){
            if(start<=timeSeries[i]){
                res += duration;
                start = timeSeries[i] + duration;
            }else{
                int temp = duration - (start - timeSeries[i]);
                start += temp;
                res += temp;
            }
            
        }
        return res;
    }
    
    
}