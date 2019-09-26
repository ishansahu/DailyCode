{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[][] kClosest(int[][] points, int K) \{\
			PriorityQueue<int[]> queue = new PriorityQueue<>( (a,b) -> (b[0]*b[0] + b[1]*b[1])-(a[0]*a[0]+ a[1]*a[1]));\
			\
			for(int[] point : points) \{\
				queue.add(point);\
				if(queue.size() > K)\
					queue.remove();\
			\}\
			int[][] result = new int[K][2];\
			\
			while(K-- >0) \{\
				result[K] = queue.remove();\
			\}\
			return result;\
		\}\
\}}