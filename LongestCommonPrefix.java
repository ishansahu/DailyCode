{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String longestCommonPrefix(String[] strs) \{\
        if(strs == null || strs.length==0) return "";\
        for(int i =0; i< strs[0].length(); i++)\{\
            char c = strs[0].charAt(i);\
            for(int k=1; k< strs.length; k++)\{\
                if(i == strs[k].length() || strs[k].charAt(i) != c)\
                    return strs[0].substring(0,i);\
            \}\
        \}\
        return strs[0];\
     \}\
\}}