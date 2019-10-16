{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh14980\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int firstUniqChar(String s) \{\
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();\
        int n = s.length();\
        for (int i = 0; i < n; i++) \{\
            char c = s.charAt(i);\
            count.put(c, count.getOrDefault(c, 0) + 1);\
        \}\
        for (int i = 0; i < n; i++) \{\
            if (count.get(s.charAt(i)) == 1) \
                return i;\
        \}\
        return -1;\
    \}\
\}}