class FileSystem {

    HashMap<String, Integer> map;
    public FileSystem() {
        map = new HashMap();    
        map.put("",0);
    }
    
    public boolean createPath(String path, int value) {
        if(map.containsKey(path)) return false;
        String str = path.substring(0,path.lastIndexOf('/'));
        if(!map.containsKey(str)) return false;
        map.put(path,value);
        return true;
    }
    
    public int get(String path) {
        return map.getOrDefault(path,-1);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */