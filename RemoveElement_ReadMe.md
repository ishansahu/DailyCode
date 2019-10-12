{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Regular;
\f3\fnil\fcharset0 Menlo-Italic;\f4\fnil\fcharset0 Menlo-Bold;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given an array\'a0
\i nums
\i0 \'a0and a value\'a0
\i val
\i0 , remove all instances of that value\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/In-place_algorithm"}}{\fldrslt 
\f1\b \cf4 \strokec4 in-place}}\'a0and return the new length.\
Do not allocate extra space for another array, you must do this by\'a0
\f1\b modifying the input array\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/In-place_algorithm"}}{\fldrslt \cf4 \strokec4 in-place}}
\f0\b0 \'a0with O(1) extra memory.\
The order of elements can be changed. It doesn't matter what you leave beyond the new length.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb5 Given 
\f3\i nums
\f2\i0  = 
\f4\b [3,2,2,3]
\f2\b0 , 
\f3\i val
\f2\i0  = 
\f4\b 3
\f2\b0 ,\
\
Your function should return length = 
\f4\b 2
\f2\b0 , with the first two elements of 
\f3\i nums
\f2\i0  being 
\f4\b 2
\f2\b0 .\
\
It doesn't matter what you leave beyond the returned length.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb5 Given 
\f3\i nums
\f2\i0  = 
\f4\b [0,1,2,2,3,0,4,2]
\f2\b0 , 
\f3\i val
\f2\i0  = 
\f4\b 2
\f2\b0 ,\
\
Your function should return length = 
\f4\b 5
\f2\b0 , with the first five elements of 
\f3\i nums
\f2\i0  containing\'a0
\f4\b 0
\f2\b0 , 
\f4\b 1
\f2\b0 , 
\f4\b 3
\f2\b0 , 
\f4\b 0
\f2\b0 , and\'a0
\f4\b 4
\f2\b0 .\
\
Note that the order of those five elements can be arbitrary.\
\
It doesn't matter what values are set beyond\'a0the returned length.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Clarification:
\f0\b0 \
Confused why the returned value is an integer but your answer is an array?\
Note that the input array is passed in by\'a0
\f1\b reference
\f0\b0 , which means modification to the input array will be known to the caller as well.\
Internally you can think of this:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb5 // 
\f4\b nums
\f2\b0  is passed in by reference. (i.e., without making a copy)\
int len = removeElement(nums, val);\
\
// any modification to 
\f4\b nums
\f2\b0  in your function would be known by the caller.\
// using the length returned by your function, it prints the first 
\f4\b len
\f2\b0  elements.\
for (int i = 0; i < len; i++) \{\
\'a0 \'a0 print(nums[i]);\
\}\
}