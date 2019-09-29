{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int maxArea(int[] height) \{\
        int left=0, right= height.length-1;\
        int maxarea =0;\
        while(left<right)\{\
            maxarea= Math.max(maxarea,(right-left)* Math.min(height[left],height[right]));\
            if(height[left] < height[right]) left++;\
            else right--;\
        \}\
        return maxarea;\
    \}\
\}}