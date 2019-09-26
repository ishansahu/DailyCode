{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 aclass Solution \{\
    public int[][] merge(int[][] intervals) \{\
		if (intervals == null || intervals.length == 0)\
            return new int[0][0];\
        Comparator<int[]> comp = new Comparator<int[]>() \{\
			@Override\
			public int compare(int[] o1, int[] o2) \{\
				return o1[0]< o2[0] ? -1 : o1[0]> o2[0] ? 1:0;\
			\}\
		\};\
		Arrays.sort(intervals,comp);\
		List<int[]> mergedList = new ArrayList<>();\
		int[] current = intervals[0];\
		for(int i=1; i< intervals.length; i++) \{\
			if(current[1] >= intervals[i][0]) \{\
				current[1] = Math.max(current[1],intervals[i][1]);\
			\}else \{\
				mergedList.add(current);\
                current = intervals[i];\
			\}\
		\}\
		mergedList.add(current);\
		return mergedList.toArray(new int[0][0]);\
    \}\
\}}