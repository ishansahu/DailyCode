{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public void nextPermutation(int[] nums) \{\
        int curr = nums.length-2;\
       \
        while (curr>=0 && nums[curr] >= nums[curr+1])\{\
            curr--;\
        \}\
        if(curr>=0)\{\
            int j = nums.length -1;\
            while(j >=0 && nums[j] <= nums[curr])\{\
                j--;\
            \} \
            swap(nums,curr,j);\
        \}\
        reverse(nums,curr +1);\
    \}\
    private void reverse(int[]nums, int start)\{\
        int i= start, j = nums.length -1;\
        while(i <j)\{\
            swap(nums,i,j);\
            i++; j--;\
        \}\
    \}\
    \
    private void swap(int[] nums, int i, int j)\{\
        int temp = nums[i];\
        nums[i]= nums[j];\
        nums[j] = temp;\
    \}\
\}\
}