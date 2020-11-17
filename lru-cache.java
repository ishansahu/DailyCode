class LRUCache {
    class Dequeue{
        int key;
        int val;
        Dequeue pre, post;
    }
    Dequeue head, tail;
    int size,count;
    HashMap<Integer, Dequeue> map;
    
    LRUCache(int capacity){
        map = new HashMap();
        this.size = capacity;
        count = 0;
        head = new Dequeue();
        tail = new Dequeue();
        head.pre = null;
        head.post = tail;
        tail.post = null;
        tail.pre = head;
    }
    
    private void addDequeue(Dequeue node){
        node.post = head.post;
        node.pre = head;
        head.post.pre = node;
        head.post = node;
    }
    
    private void removeDequeue(Dequeue node){
        Dequeue pre = node.pre;
        Dequeue post = node.post;
        pre.post = post;
        post.pre = pre;
    }
    
    private void moveToHead(Dequeue node){
        removeDequeue(node);
        addDequeue(node);
    }
    
    private int popTail(){
        Dequeue curr = tail.pre;
        removeDequeue(curr);
        return curr.key;
    }
    
    public int get(int key){
        if(map.containsKey(key)){
            Dequeue node = map.get(key);
            moveToHead(node);
            return node.val;
        }
        return -1;
    }
    
    
    
    public void put(int key, int value){
        Dequeue node = map.get(key);
        if(node == null){
            Dequeue curr = new Dequeue();
            curr.key = key;
            curr.val = value;
            map.put(key, curr);
            addDequeue(curr);
            if(++count > size){
                --count;
                int last = popTail();
                map.remove(last);
            } 
        }else{
            node.val = value;
            moveToHead(node);
        }
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */