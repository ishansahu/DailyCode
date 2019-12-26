{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    \
    public int strStr_Leetcode(String haystack, String needle) \{\
        int i=0;\
        while(true)\{\
                int j=0;\
            while(true)\{\
                if(j == needle.length() ) return i;\
                if((i+j) == haystack.length() )return -1;\
                if(needle.charAt(j) != haystack.charAt(i + j)) break;\
                j++;\
            \}\
            i++;\
        \}\
    \}\
    \
    public int strStr(String haystack, String needle) \{\
        if(needle.length() == 0 || needle == null) return 0;\
        char[] main = haystack.toCharArray();\
        char[] sub = needle.toCharArray();\
        int i=0;\
        int j=main.length;\
        int k= sub.length;\
        while (i<j)\{\
            if(main[i] == sub[0] && (i+k-1) <j)\{\
                int temp =i+1, p=1;\
                while(  p <k )\{\
                    if (main[temp]==sub[p])\{\
                        temp++;\
                        p++;                        \
                    \}else break;\
                \}\
                if(p == k) return i;\
            \}\
            i++;\
        \}\
        return -1;\
    \}\
\}}