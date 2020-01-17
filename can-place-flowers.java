class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int res =0;
        for(int i=0; i< flowerbed.length; i++){
            if(flowerbed[i] == 0){
                int next = (i+1 >=flowerbed.length ?0: flowerbed[i+1]);
                int prev = (i == 0 ?0: flowerbed[i-1]);
                if(prev ==0 && next ==0){
                    res++;  
                    flowerbed[i] =1;
                } 
            }
        }
        return res >= n;
    }
}