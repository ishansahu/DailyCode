{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    int [] nums;\
	int target;\
	\
    public int rotation_index(int low, int high) \{\
			if(nums[low] < nums[high])\
				return 0;\
			while(high >= low) \{\
				int mid = (high + low)/2;\
				if(nums[mid]> nums[mid + 1])\
					return mid+1;\
				else \{\
                    if(nums[mid] < nums[low])\
					    high = mid-1;\
				    else \
					low = mid +1;\
				\}\
			\}\
		return 0;	\
		\}	\
    \
    public int b_search(int low, int high) \{\
			\
			while(high >= low)\{\
				int mid = (low + high)/2;\
				if(nums[mid] == target)\
					return mid;	\
				else\{\
					if(target >nums[mid]) \
						low = mid +1;\
					else\
						high = mid -1;\
				\}\
			\}\
			return -1;\
		\}\
    \
    public int search(int[] nums, int target) \{\
			this.nums = nums;\
			this.target = target;\
			int n = nums.length;\
			\
			if(n == 0) \{\
				return -1;\
			\}\
			if(n == 1) \{\
				return this.nums[0] == target ? 0 : -1;\
			\}\
			int r_index = rotation_index(0, n-1);\
			if(r_index == 0)\
				return b_search(0, n-1);\
			if(target == nums[r_index])\
				return r_index;\
			else if(target < nums[0])\
				return b_search(r_index, n-1);\
			return b_search(0, r_index);\
	        \
	    \}\
		\
		\
		\
\}}