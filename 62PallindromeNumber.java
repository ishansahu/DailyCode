{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    \
    public boolean isPalindrome(int x) \{\
        if(x < 0 || (x != 0 && x%10 == 0)) return false;\
        int rev = 0;\
        while(x > rev)\{\
            rev = (rev * 10)+ x%10;\
            x /=10;\
        \}\
        return (x == rev || x == rev/10);\
    \}\
    \
    \
    public boolean isPalindrome_MySol(int x) \{\
        if(x < 0) return false;\
        int num = x;\
        int sum =0;\
        while(num !=0)\{\
            sum = (sum * 10)+ num%10;\
            num /=10;\
        \}\
        return x == sum;\
    \}\
\}}