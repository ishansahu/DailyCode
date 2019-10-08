{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> subdomainVisits(String[] cpdomains) \{\
        HashMap<String, Integer> domain = new HashMap<String,Integer>();\
       \
        for(String str : cpdomains)\{\
            String[] s =str.split("\\\\s+");\
            int count = Integer.parseInt(s[0]);\
            String[] frags = s[1].split("\\\\.");\
            String cur = "";\
            for(int i = frags.length-1; i>=0; --i)\{\
                cur = frags[i] + (i < frags.length -1? "." : "") +cur;\
                domain.put(cur,domain.getOrDefault(cur,0)+count);\
            \}\
        \}\
        \
        List<String> output = new ArrayList<String>();\
        for(String str : domain.keySet())\
            output.add("" + domain.get(str) + " "+ str);\
        \
        return output;\
        \
    \}\
\}}