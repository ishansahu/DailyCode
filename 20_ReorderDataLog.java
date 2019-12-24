{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String[] reorderLogFiles(String[] logs) \{\
			Comparator<String> comp = new Comparator<String>() \{\
			@Override\
			public int compare(String s1, String s2) \{\
				int s1First = s1.indexOf(' ');\
				int s2First = s2.indexOf(' ');\
				char s1Char = s1.charAt(s1First + 1);\
				char s2Char = s2.charAt(s2First + 1);\
				if( s1Char <= '9' ) \{\
					if(s2Char <= '9' )\
						return 0;\
					else return 1;\
				\}\
				if(s2Char<= '9' ) return -1;\
				int strcomp = s1.substring(s1First).compareTo(s2.substring(s2First));\
				if(strcomp ==0) return s1.substring(0,s1First).compareTo(s2.substring(0, s2First));\
				return strcomp;\
			\}\
		\};\
		Arrays.sort(logs,comp);\
		return logs;\
	\}\
\}}