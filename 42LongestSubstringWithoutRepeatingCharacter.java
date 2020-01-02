{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int lengthOfLongestSubstring(String s) \{\
        if(s == null || s.length() ==0)\
        	return 0;\
	    int i=0, j=0, n = s.length();\
        Set<Character> maxset = new HashSet();\
		int maxLength = 0;\
		while(i<n && j<n) \{\
			if(!maxset.contains(s.charAt(j))) \{\
				maxset.add(s.charAt(j++));\
				maxLength = Math.max(maxLength,j-i);\
			\}else \{\
				maxset.remove(s.charAt(i++));\
			\}\
		\}\
		return maxLength;\
    \}\
\}}