class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if(len<=2) return true;
        double slop = (coordinates[1][1] - coordinates[0][1])/((coordinates[1][0] - coordinates[0][0])*(1.0));
        for(int i=2; i<len; ++i){
            double  temp = (coordinates[i][1] - coordinates[0][1])/((coordinates[i][0] - coordinates[0][0])*1.0);
            if(slop != temp) return false;
        }
        return true;
    }
}