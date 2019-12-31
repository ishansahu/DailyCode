{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh14480\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs30 \cf0 class MaxStack \{\
    Stack<Integer> stack;\
    Stack<Integer> maxStack;\
\
    public MaxStack() \{\
        stack = new Stack();\
        maxStack = new Stack();\
    \}\
\
    public void push(int x) \{\
        int max = maxStack.isEmpty() ? x : maxStack.peek();\
        maxStack.push(max > x ? max : x);\
        stack.push(x);\
    \}\
\
    public int pop() \{\
        maxStack.pop();\
        return stack.pop();\
    \}\
\
    public int top() \{\
        return stack.peek();\
    \}\
\
    public int peekMax() \{\
        return maxStack.peek();\
    \}\
\
    public int popMax() \{\
        int max = peekMax();\
        Stack<Integer> buffer = new Stack();\
        while (top() != max) buffer.push(pop());\
        pop();\
        while (!buffer.isEmpty()) push(buffer.pop());\
        return max;\
    \}\
\}}