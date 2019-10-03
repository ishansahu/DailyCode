{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int maxProfit(int[] prices) \{\
        if(prices == null || prices.length ==0 || prices.length == 1) return 0;\
        int l = prices.length -1;\
        int buy = prices[0];\
        int profit = 0;\
        int i =1;\
        while (i <= l)\{\
            if( prices[i] < buy)\{\
                buy = prices[i];\
            \}else\{\
                profit = prices[i] - buy > profit ? prices[i] - buy : profit;\
            \}\
            i++;\
        \}\
        profit = profit > 0 ? profit : 0;\
        return profit;\
    \}\
\}}