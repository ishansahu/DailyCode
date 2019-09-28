{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<List<Integer>> permute(int[] nums) \{\
	        List<List<Integer>> output = new LinkedList();\
	        ArrayList<Integer> nums_lst = new ArrayList();\
	        for(int num : nums) \{\
	        	nums_lst.add(num);\
	        \}\
	        int n = nums_lst.size();\
	        Backtrack(n, nums_lst, output, 0);\
	        return output;\
	    \}\
	    \
	    public void Backtrack(int n, ArrayList<Integer> nums,\
                List<List<Integer>> output,int first) \{\
	    		if(first == n) \
	    			output.add(new ArrayList(nums));\
	    	for(int i = first; i < n; i++) \{\
	    		Collections.swap(nums, first, i);\
	    		Backtrack(n, nums, output, first+1);\
	    		Collections.swap(nums, first, i);\
	    	\}\
	    \}\
\}}