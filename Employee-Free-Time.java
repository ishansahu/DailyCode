/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/
class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<List<Interval>> free = new ArrayList();
        int first=Integer.MAX_VALUE, last = Integer.MIN_VALUE;
        for(List<Interval> ls : schedule){
            first = Math.min(ls.get(0).start, first);
            last = Math.max(ls.get(ls.size() -1).end, last);
        }
        for(List<Interval> ls : schedule){
            List<Interval> emp = new ArrayList();
            if(ls.get(0).start> first) emp.add(new Interval(first, ls.get(0).start));
            for(int i=1; i<ls.size();i++){
                if(ls.get(i).start > ls.get(i-1).end){
                    Interval in = new Interval(ls.get(i-1).end, ls.get(i).start);
                    emp.add(in);
                }
            }
             if(ls.get(ls.size()-1).end < last) emp.add(new Interval(ls.get(ls.size()-1).end, last));
            if(!emp.isEmpty()){
                free.add(emp);
            }
        }
       while(free.size() >1){
            free.add(helper(free.remove(0), free.remove(0)));
        }
        return free.get(0);
    }
    
    public List<Interval> helper(List<Interval> A, List<Interval> B) {
        int i=0,j=0;
        int startmax, endmin;
        List<Interval> res = new ArrayList();
        while(i<A.size() && j<B.size()){
            startmax = Math.max(A.get(i).start, B.get(j).start);
            endmin = Math.min(A.get(i).end, B.get(j).end);
            if(endmin > startmax){
                res.add(new Interval(startmax,endmin));
            }
            if(A.get(i).end == endmin) i++;
            if(B.get(j).end == endmin) j++;
        }
        return res;
    }
    
    
    
    
}