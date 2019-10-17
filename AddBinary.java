{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String addBinary(String a, String b) \{\
        StringBuilder sb = new StringBuilder();\
        int a1 = a.length()-1, b1 = b.length()-1;\
        int carry =0;\
        while(a1 >=0 || b1>= 0)\{\
            int sum = carry;\
            if(a1 >= 0) sum += a.charAt(a1--) -'0';\
            if(b1 >= 0)sum += b.charAt(b1--) - '0';\
            sb.append(sum%2);\
            carry = sum/2;\
            \
        \}\
        if(carry>0) sb.append(carry);\
        return sb.reverse().toString();\
    \}\
\}}