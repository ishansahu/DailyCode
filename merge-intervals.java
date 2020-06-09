class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length ==0) return new int[0][];
        Arrays.sort(intervals, (i1,i2)-> i1[0]-i2[0]);
        List<int[]> res = new ArrayList();
        int start=intervals[0][0], end=intervals[0][1];
        for(int[] interval : intervals){
            if(interval[0] <= end ){
                end = Math.max(end, interval[1]);
            }else{
                res.add(new int[]{start,end});
                start = interval[0];
                end = interval[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][2]);
    }
}