class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;
        int m = houses.length, n = heaters.length;
        int i=0,k=0;
        while(i<m){
            while(k<n-1 && Math.abs(heaters[k] - houses[i]) >= Math.abs(heaters[k+1]-houses[i])){
                ++k;
            }
            res = Math.max(res, Math.abs(heaters[k] - houses[i]));
            i++;
        }
        return res;
    }
}