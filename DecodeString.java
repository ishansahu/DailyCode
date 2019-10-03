{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String decodeString(String s) \{\
        Deque<Character> q = new LinkedList<>();\
        \
        for(char c : s.toCharArray()) \{\
        	q.add(c);\
        \}\
        return helper(q);\
    \}\
	\
	public String helper(Deque<Character> q) \{\
		\
		StringBuilder str = new StringBuilder();\
		int num = 0;\
		while(!q.isEmpty()) \{\
			char c = q.poll();\
			if( Character.isDigit(c) ) \{\
			    num = num *10 + c - '0' ;\
            \}else if(c == '[') \{\
				String sub = helper(q);\
				for(int i = 0; i < num; i++) str.append(sub);\
                num = 0;\
			\}else if (c == ']') \{\
				break;\
			\}else \{\
				str.append(c);\
			\}\
		\}\
		\
		return str.toString();\
	\}\
\}}