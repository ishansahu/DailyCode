{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> generateParenthesis(int n) \{\
	        if(n ==0) return new ArrayList<String>();\
	        return helper("",0,0, n);\
	    \}\
	    public List<String> helper(String str, int L, int R, int n)\{\
	    	List<String> output = new ArrayList();\
	    	if(L< R || R>n || L>n) return output;\
	    	if(L==n && R==n) output.add(str);\
	    	else \{\
	    		output.addAll(helper(str+"(",L+1,R,n));\
	    		output.addAll(helper(str+")",L,R+1,n));\
	    	\}\
	    	return output;\
	    \}\
\}}