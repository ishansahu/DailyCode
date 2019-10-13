{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String countAndSay(int n) \{\
        if(n == 1) return "1";\
        String curr = countAndSay(n-1);\
        StringBuilder next  = new StringBuilder();\
        int i =0;\
        while(i< curr.length())\{\
            int count = 0;\
            char val = curr.charAt(i);\
            while( i < curr.length() && val == curr.charAt(i))\{\
                count++;\
                i++;\
            \}\
            next.append(String.valueOf(count));\
            next.append(val);\
            \
        \}    \
        return next.toString();\
    \}\
\}}