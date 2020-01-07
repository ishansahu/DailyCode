class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return true;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        //int temp = intervals[0][1];
        for(int i=1; i<intervals.length;i++){
            if(intervals[i-1][1]> intervals[i][0]) return false;
        }
        return true;
    }
}