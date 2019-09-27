{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
        public List<List<String>> groupAnagrams(String[] strs) \{\
	    	if(strs.length == 0) \
	    		return new ArrayList<>();\
	    	Map<String,ArrayList<String>> multiMap = new HashMap<>();\
	        int[] count = new int[26];\
            for(String str : strs) \{\
                Arrays.fill(count,0);\
                for(char c : str.toCharArray() )\{\
                    count[c-'a']++;\
                \}\
                StringBuilder sb = new StringBuilder("");\
                for(int i = 0; i< 26; i++)\{\
                    sb.append('#');\
                    sb.append(count[i]);\
                \}\
                String key = sb.toString();\
                if(!multiMap.containsKey(key))\
	        		multiMap.put(key, new ArrayList<String>());\
	        	multiMap.get(key).add(str);\
	        \}\
	        return  new ArrayList<>( multiMap.values()); \
	    \}\
\}}