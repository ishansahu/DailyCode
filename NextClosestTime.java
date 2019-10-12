{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String nextClosestTime(String time) \{\
        int minutes = Integer.parseInt(time.substring(0,2)) * 60;\
        minutes += Integer.parseInt(time.substring(3));\
        HashSet<Integer> digits = new HashSet<>();\
        for(char c : time.toCharArray())\{\
            digits.add(c -'0');\
        \}\
        while(true)\{\
            minutes = (minutes+1) % (24 * 60);\
            int[] nextTime = \{ minutes /60 /10, minutes/ 60 % 10, minutes % 60 / 10, minutes % 60 % 10\};\
            boolean isValid = true;\
            for(int digit: nextTime)\{\
                if(!digits.contains(digit))\{\
                    isValid = false;\
                    break;\
                \}\
            \}\
            if(isValid)\{\
                return String.format("%02d:%02d", minutes / 60, minutes % 60);\
            \}\
        \}\
    \}\
\}}