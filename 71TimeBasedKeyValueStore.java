import java.util.Map.Entry;

class TimeMap {

    /** Initialize your data structure here. */
    HashMap<String, HashMap<String, Integer>> map1;
    
    public TimeMap() {
        map1 = new HashMap<String, HashMap<String, Integer>>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<String,Integer> map2 = new HashMap<String, Integer>();
        map2.put(value, timestamp);
        map1.put(key, map2);
    }
    
    public String get(String key, int timestamp) {
        if(!map1.containsKey(key)) return new String("");
        HashMap<String,Integer> map2 = map1.get(key);
        int p1 = timestamp;
        String val = new String("");
        for(Entry<String,Integer> a : map2.entrySet()){
            if(a.getValue() <= p1 ){
                p1 =  a.getValue();
                val = a.getKey();
                if(a.getValue() >timestamp){
                    p1 =  a.getValue();
                    val = a.getKey();
                }
            } 
        }
        return val;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */