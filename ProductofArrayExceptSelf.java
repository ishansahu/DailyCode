{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] productExceptSelf(int[] nums) \{\
        int len = nums.length;\
		int[] lnum = new int[len];\
        int[] rnum = new int[len];\
        int[] ans = new int[len];\
        lnum[0] =1;\
        rnum[len-1]=1;\
        for(int i =1; i < len ;i++)\{\
            lnum[i] = nums[i-1]*lnum[i-1];\
        \}\
        for(int i =len-2; i>= 0;i--)\{\
            rnum[i] = nums[i+1]*rnum[i+1];\
        \}\
        for(int i =0; i < len ;i++)\{\
            ans[i] = lnum[i]*rnum[i];\
        \}\
       return ans; \
    \}\
\}}