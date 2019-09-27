{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int minMeetingRooms(int[][] intervals) \{\
	    	\
	    	if(intervals == null)\
	    		return -1;\
            if (intervals.length == 0) \{\
              return 0;\
            \}\
            int n = intervals.length;\
	    	Arrays.sort(intervals, (a,b) ->  a[0] - b[0]  );\
	    	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();\
            minHeap.add(intervals[0][1]);\
            for(int i=1; i < n ; i++) \{\
            	if(minHeap.peek() <= intervals[i][0])\{\
                        minHeap.poll();\
                \}\
                minHeap.add(intervals[i][1]);\
	    	\}\
	    	return minHeap.size();\
	    \}\
\}}