class Solution {
    public int numTeams(int[] rating) {
        int res =0;
        for(int j=0; j<rating.length; ++j){
            int leftL =0, rightG=0, leftG=0, rightL=0;
            for(int i=0; i<j; ++i){
                if(rating[i]>rating[j]) ++leftG;
                else if(rating[i]<rating[j]) ++leftL;
            }
            for(int k=j+1; k<rating.length; ++k){
                if(rating[k]>rating[j]) ++rightG;
                else if(rating[k]<rating[j]) ++rightL;
            }
            res += leftL*rightG + rightL*leftG;
        }
        return res;
    }
}