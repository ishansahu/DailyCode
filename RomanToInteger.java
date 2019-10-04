{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int romanToInt(String s) \{\
        int res = 0;\
        for (int i = 0; i < s.length(); i++) \{\
            switch (s.charAt(i)) \{\
                case 'M': \{\
                    if (i > 0 && s.charAt(i-1) == 'C') res += 800;\
                    else res += 1000;\
                    break;\
                \}\
                case 'D': \{\
                    if (i > 0 && s.charAt(i-1) == 'C') res += 300;\
                    else res += 500;\
                    break;\
                \}\
                case 'C': \{\
                    if (i > 0 && s.charAt(i-1) == 'X') res += 80;\
                    else res += 100;\
                    break;\
                \}\
                case 'L': \{\
                    if (i > 0 && s.charAt(i-1) == 'X') res += 30;\
                    else res += 50;\
                    break;\
                \}\
                case 'X': \{\
                    if (i > 0 && s.charAt(i-1) == 'I') res += 8;\
                    else res += 10;\
                    break;\
                \}\
                case 'V': \{\
                    if (i > 0 && s.charAt(i-1) == 'I') res += 3;\
                    else res += 5;\
                    break;\
                \}\
                case 'I': \{\
                    res += 1;\
                    break;\
                \}\
                default: return 0;\
            \}\
        \}\
        return res;\
    \}\
\}}