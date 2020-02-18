class Solution {
    public int smallestCommonElement(int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int first : mat[0]) map.put(first,1);
        for(int i=1; i<mat.length; ++i){
            for(int j=0; j<mat[i].length; ++j){
                int temp = mat[i][j];
                if(map.containsKey(temp)) map.put(temp,map.get(temp)+1);
            }
        }
        int res = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == mat.length) res = Math.min(res,entry.getKey());
        }
        return res == Integer.MAX_VALUE ? -1: res;
    }
}