{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fmodern\fcharset0 Courier;
}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red67\green91\blue103;\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c32941\c43137\c47843;\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Implement\'a0
\f1\b next permutation
\f0\b0 , which rearranges numbers into the lexicographically next greater permutation of numbers.\
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).\
The replacement must be\'a0{\field{\*\fldinst{HYPERLINK "http://en.wikipedia.org/wiki/In-place_algorithm"}}{\fldrslt 
\f1\b \cf4 \strokec4 in-place}}\'a0and use only constant\'a0extra memory.\
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.\
\pard\pardeftab720\sl300\sa280\partightenfactor0

\f2\fs26 \cf5 \cb6 \strokec5 1,2,3
\f0\fs28 \cf2 \cb3 \strokec2 \'a0\uc0\u8594 \'a0
\f2\fs26 \cf5 \cb6 \strokec5 1,3,2
\f0\fs28 \cf2 \cb1 \strokec2 \uc0\u8232 
\f2\fs26 \cf5 \cb6 \strokec5 3,2,1
\f0\fs28 \cf2 \cb3 \strokec2 \'a0\uc0\u8594 \'a0
\f2\fs26 \cf5 \cb6 \strokec5 1,2,3
\f0\fs28 \cf2 \cb1 \strokec2 \uc0\u8232 
\f2\fs26 \cf5 \cb6 \strokec5 1,1,5
\f0\fs28 \cf2 \cb3 \strokec2 \'a0\uc0\u8594 \'a0
\f2\fs26 \cf5 \cb6 \strokec5 1,5,1
\f0\fs28 \cf2 \cb3 \strokec2 \
}