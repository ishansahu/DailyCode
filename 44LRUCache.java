{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
public class LRUCache \{\
\
	    class DLinkNode\{\
	        int key,value;\
	        DLinkNode prev, next;\
	    \}\
	    \
	    private Hashtable<Integer, DLinkNode> cache = new Hashtable<Integer,DLinkNode>();\
	    \
	    private int size, capacity;\
	    private DLinkNode head, tail;\
	    \
	    \
	    \
	    private void addNode(DLinkNode node)\{\
	         node.prev = head;\
	         node.next = head.next;\
	         \
	        head.next.prev = node;\
	        head.next = node; \
	    \}\
	    \
	    private void removeNode(DLinkNode node)\{\
	        \
	        DLinkNode next = node.next;\
	        DLinkNode prev = node.prev;\
	        prev.next = next;\
	        next.prev = prev;\
	    \}\
	    \
	    private void movetoHead(DLinkNode node)\{\
	        removeNode(node);\
	        addNode(node);\
	    \}\
	    \
	    private DLinkNode popTail()\{\
	        \
	        DLinkNode res = tail.prev;\
	        removeNode(res);\
	         return res;\
	    \}\
	   \
	    \
	    \
	    public LRUCache(int capacity)\{\
	        this.size =0;\
	        this.capacity = capacity;\
	        \
	        head = new DLinkNode();\
	        tail = new DLinkNode();\
	        \
	        head.next = tail;\
	        tail.prev = head;\
	    \}\
	    \
	    public int get(int key) \{\
	        DLinkNode node = cache.get(key);  \
	        if(node == null) return -1;\
	        movetoHead(node);\
	        return node.value;\
	        \
	    \}\
	    \
	    public void put(int key, int value) \{\
	        DLinkNode node = cache.get(key);\
	        if(node == null)\{\
	            DLinkNode newNode = new DLinkNode();\
	            newNode.key = key;\
	            newNode.value = value;\
	            \
	            cache.put(key,newNode);\
	            addNode(newNode);\
	            size++;\
	            \
	            if(size > capacity) \{\
	            DLinkNode tail = popTail();\
	            cache.remove(tail.key);\
	            --size;\
	      \}\
	            \
	        \}else\{\
	            node.value = value;\
	            movetoHead(node);\
	        \}\
	    \}\
	\}\
\
	/**\
	 * Your LRUCache object will be instantiated and called as such:\
	 * LRUCache obj = new LRUCache(capacity);\
	 * int param_1 = obj.get(key);\
	 * obj.put(key,value);\
	 */\
\
\
}