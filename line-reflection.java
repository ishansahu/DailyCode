class Solution {
    public boolean isReflected(int[][] points) {
        HashSet<Integer> set = new HashSet();
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int[] point : points){
            left = Math.min(point[0], left);
            right = Math.max(point[0], right);
            int temp = 100000 +100*point[0]+point[1];
            set.add(temp);
            
        }
        double axis = (left+ right)/2.0;
        for(int[] point : points){
            int temp = 100000 +100*point[0]+point[1];
            if(point[0] == axis){
                if(!set.contains(temp)) return false;
            }else if(point[0] > axis){
                int currP = (int)(point[0] - 2*(point[0]-axis));
                int curr = 100000 +100*currP+point[1];
                if(!set.contains(curr))return false;
            }else{
                int currP = (int)(point[0] + 2*(axis -point[0]));
                int curr = 100000 +100*currP+point[1];
                if(!set.contains(curr))return false;
            }
        }
        return true;
    }
}