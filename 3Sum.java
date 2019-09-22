{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
  public List<List<Integer>> threeSum(int[] nums) \{\
		  Arrays.sort(nums);\
	      List<List<Integer>> result = new ArrayList<List<Integer>>();  \
		  int len = nums.length;\
		  int sum =0;\
		  int low, high;\
		  for(int i = 0; i< len - 2; i++) \{\
			  sum = 0 - nums[i];\
			  low=i+1; high = len -1;\
			  if(i ==0 || (i >0 && nums[i] != nums[i -1])) \{\
				  while(low < high) \{\
					  while(low < high && nums[low] == nums[low +1])\
						  low++;\
					  while(low < high && nums[high] == nums[high-1])\
						  high--;\
					  if (nums[low] + nums[high] == sum) \{\
						result.add(Arrays.asList(nums[i],nums[low],nums[high]));\
						 System.out.println("i : "+i+" low "+low+" high "+high);\
						low++;high--;\
					  \}else if(nums[low] + nums[high] < sum) \{\
						    low++;\
					  \}else \{\
						    high--;\
					  \}\
				  \}\
			  \}\
		  \}\
		  return result;	  \
	 \}\
\}}