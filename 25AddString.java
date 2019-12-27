{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String addStrings(String num1, String num2) \{\
        StringBuilder str = new StringBuilder();\
        int l1 = num1.length() -1;\
        int l2 = num2.length() -1;\
        int carry =0;\
        while(l1>=0 || l2 >=0)\{\
            int sum = carry;\
            if(l1 >= 0) sum += num1.charAt(l1--) -'0';\
            if(l2 >= 0) sum += num2.charAt(l2--) -'0';\
            str.append(sum%10);\
            carry = sum/10;\
        \}\
        if(carry >0) str.append(carry);\
        return str.reverse().toString();\
    \}\
\}}