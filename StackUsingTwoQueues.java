{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MyStack \{\
\
    class Node\{\
        int value;\
        Node next;\
    \} \
    \
   Node rear, top;\
    \
    public MyStack() \{\
         rear = new Node();\
    \}\
    \
    /** Push element x onto stack. */\
    public void push(int x) \{\
        Node n1 = new Node();\
        n1.value = x;\
        if(rear.next != null)\{\
            n1.next = rear.next;\
        \}\
        top = n1; \
        rear.next = n1;\
    \}\
    \
    /** Removes the element on top of the stack and returns that element. */\
    public int pop() \{\
        int popValue = top.value ;\
        if(top.next !=null)\{\
            top = top.next;\
        \}else\{\
            top = null;\
        \}\
        return popValue;\
    \}\
    \
    /** Get the top element. */\
    public int top() \{\
        return top.value;\
    \}\
    \
    /** Returns whether the stack is empty. */\
    public boolean empty() \{\
        return (top == null)?true:false;\
    \}\
\}\
\
/**\
 * Your MyStack object will be instantiated and called as such:\
 * MyStack obj = new MyStack();\
 * obj.push(x);\
 * int param_2 = obj.pop();\
 * int param_3 = obj.top();\
 * boolean param_4 = obj.empty();\
 */}