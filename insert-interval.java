class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList();
        if(intervals == null || intervals.length ==0){
            if(newInterval == null) return new int[0][];
            res.add(newInterval);
            return res.toArray(new int[res.size()][2]);
        }
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res.add(intervals[i++]);
        }
        int start = newInterval[0], end = newInterval[1];
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            start = Math.min(intervals[i][0],start);
            end = Math.max(intervals[i++][1], end);
        }
        res.add(new int[]{start,end});
        while(i < intervals.length){
            res.add(intervals[i++]);
        }
        return res.toArray(new int[res.size()][2]);
    }
}