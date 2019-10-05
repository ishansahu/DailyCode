{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numJewelsInStones(String J, String S) \{\
        if (J == null || S == null || J.length() ==0 || S.length() == 0) return 0;\
        \
        Set<Character> JSet = new HashSet();\
        for(char c : J.toCharArray())   JSet.add(c);\
        \
        int ans =0;\
        for(char c : S.toCharArray())\{\
            if( JSet.contains(c)) ans++;\
        \}\
        return ans;\
    \}\
    \
    public int numJewelsInStones_Sort(String J, String S) \{\
        if (J == null || S == null || J.length() ==0 || S.length() == 0) return 0;\
        char[] jewels = J.toCharArray();\
        char[] stones = S.toCharArray();\
        Arrays.sort(jewels);\
        Arrays.sort(stones);\
        \
        int i= 0;\
        int j = 0;\
        int count =0;\
         \
        while (i <stones.length && j < jewels.length)\{\
            if(jewels[j] == stones[i] )\{\
                    count++;  \
                    i++;\
            \}else if(jewels[j] > stones[i] ) i++;\
            else j++;\
        \}\
        return count;\
        \
    \}\
\}}