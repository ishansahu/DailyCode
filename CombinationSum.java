{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
   public List<List<Integer>> combinationSum(int[] candidates, int target) \{\
	        List<List<Integer>> output = new LinkedList();\
	        ArrayList<Integer> cand_lst = new ArrayList();\
	        ArrayList<Integer> curr_lst = new ArrayList();\
	        for(int num : candidates) \{\
	        	cand_lst.add(num);\
	        \}\
	        int n = cand_lst.size();\
	        Cand_Backtrack(n,cand_lst,output,target,curr_lst,0);\
	        return output;\
	    \}\
	    \
	    public void Cand_Backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int curr_sum, ArrayList<Integer> curr_lst , int pos ) \{\
	    	if(curr_sum < 0)\
	    		return;\
	    	else if(curr_sum == 0) \{\
	    		output.add(new ArrayList(curr_lst));\
	    	\}\
	    	for(int i = pos; i<n ; i++) \{\
	    		curr_lst.add(nums.get(i));\
	    		Cand_Backtrack(n, nums, output, curr_sum - nums.get(i), curr_lst , i );\
	    		curr_lst.remove(curr_lst.size()-1);\
	    	\}\
	    \}\
\}}