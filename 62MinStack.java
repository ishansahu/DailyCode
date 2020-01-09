{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MinStack \{\
\
    /** initialize your data structure here. */\
    private class Node\{\
        int val;\
        int min;\
        Node next;\
        \
        private Node(int val, int min)\{\
            this(val,min,null);\
        \}\
        private Node(int val, int min, Node next)\{\
            this.val = val;\
            this.min = min;\
            this.next = next;\
        \}\
    \}\
    \
    Node head;\
    public MinStack() \{\
        head = null;\
    \}\
    \
    public void push(int x) \{\
        if(head == null)\
            head = new Node(x,x);\
        else\{\
           head = new Node(x, Math.min(x, head.min), head);\
        \}\
    \}\
    \
    public void pop() \{\
        head = head.next;\
    \}\
    \
    public int top() \{\
        if(head == null)\
            return -1;\
        return head.val;   \
    \}\
    \
    public int getMin() \{\
        if(head == null)\
            return -1;\
        return head.min; \
    \}\
\}\
\
/**\
 * Your MinStack object will be instantiated and called as such:\
 * MinStack obj = new MinStack();\
 * obj.push(x);\
 * obj.pop();\
 * int param_3 = obj.top();\
 * int param_4 = obj.getMin();\
 */}