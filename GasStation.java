class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index =0;
        int gtank=0, temptank =0;
        for(int i=0; i<gas.length; ++i){
            gtank += gas[i] - cost[i];
            temptank += gas[i] - cost[i];
            if(temptank <0){
                temptank =0;
                index = i+1;
            }
        }
        return gtank >=0?index:-1;
        
    }
}