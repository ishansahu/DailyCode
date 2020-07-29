class StockSpanner {
    List<Integer> list, res;
    
    public StockSpanner() {
        list = new ArrayList();
        res = new ArrayList();
    }
    
    public int next(int price) {
        int i = list.size()-1, days=1;
        while(i>=0 && list.get(i)<= price ){
                i -=res.get(i);
        }
        days = list.size()-i;
        list.add(price);
        res.add(days);
        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */