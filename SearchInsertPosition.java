{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    \
    public int searchInsert(int[] nums, int target) \{\
        int low =0, high = nums.length -1;\
        \
        while(low < high)\{\
            int mid = (low + high)/2;\
            if(target == nums[mid]) return mid;\
            else if (nums[mid] > target) high = mid;\
            else low = mid +1;\
        \}\
        return target > nums[low] ? low +1: low;\
    \}\
    \
    public int searchInsert_mySol(int[] nums, int target) \{\
        for(int i = 0; i < nums.length; i++)\{\
            if(target <= nums[i] ) \
                return i;\
        \}\
        return nums.length;\
    \}\
\}}