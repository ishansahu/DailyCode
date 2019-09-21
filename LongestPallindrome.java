{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
public String longestPalindrome(String s) \{\
     if (s == null || s.length() < 1) return "";    \
     int leftlength=0, rightlength =0, length =0;\
    	int startpos=0,endpos=0;\
    	for(int i=0; i<s.length(); i++)\{\
    		leftlength = checkPallindrome(s,i, i);\
    		rightlength = checkPallindrome(s,i, i+1);\
    		length = Math.max(leftlength, rightlength);\
    		if(length > (endpos - startpos)) \{\
    			startpos = i - (length-1)/2;\
    			endpos = i + length/2;\
    		\}\
    	\}\
    	return s.substring(startpos, endpos+1);\
    \}\
    \
    public int checkPallindrome(String str,int left,int right)\{\
    	\
    	while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) \{\
    		left--;right++;\
       \}\
    	return right - left -1;\
    \}\
\}}