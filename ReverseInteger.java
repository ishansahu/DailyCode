{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue255;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0\c74902;\cssrgb\c100000\c100000\c100000;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl360\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Solution \{\
    public int reverse(int x) \{\
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;\
        int rev =0;\
        while(x != 0)\{\
            int pop = x%10;\
            x /=10;\
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop >7)) return 0;\
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;\
            rev = rev * 10 + pop;\
        \}\
        return rev;\
    \}\
\}}