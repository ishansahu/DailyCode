{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    \
    public int[] countBits(int num) \{\
        int[] res = new int[num + 1];\
        for (int i=1; i<=num; i++) res[i] = res[i >> 1] + (i & 1);\
        return res;\
    \}\
    \
    public int[] countBits_detailed(int num) \{\
        int[] res = new int[num+1];\
        int i=0, b=1;\
        while (b <= num)\{\
            while( i < b && i+b <= num)\{\
                res[i+b] = res[i] + 1;\
                i++;\
            \}\
            i =0;\
            b <<=1;\
        \}\
        return res;\
    \}\
\}}