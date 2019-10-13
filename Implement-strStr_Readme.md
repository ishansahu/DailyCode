{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;\f4\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red245\green247\blue249;\red67\green91\blue103;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c96863\c97647\c98039;\cssrgb\c32941\c43137\c47843;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Implement\'a0{\field{\*\fldinst{HYPERLINK "http://www.cplusplus.com/reference/cstring/strstr/"}}{\fldrslt \cf4 \strokec4 strStr()}}.\
Return the index of the first occurrence of needle in haystack, or\'a0
\f1\b -1
\f0\b0 \'a0if needle is not part of haystack.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:
\f3\b0  haystack = "hello", needle = "ll"\

\f2\b Output:
\f3\b0  2\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:
\f3\b0  haystack = "aaaaa", needle = "bba"\

\f2\b Output:
\f3\b0  -1\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Clarification:
\f0\b0 \
What should we return when\'a0
\f4\fs26 \cf6 \cb5 \strokec6 needle
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is an empty string? This is a great question to ask during an interview.\
For the purpose of this problem, we will return 0 when\'a0
\f4\fs26 \cf6 \cb5 \strokec6 needle
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is an empty string. This is consistent to C's\'a0{\field{\*\fldinst{HYPERLINK "http://www.cplusplus.com/reference/cstring/strstr/"}}{\fldrslt \cf4 \strokec4 strstr()}}\'a0and Java's\'a0{\field{\*\fldinst{HYPERLINK "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)"}}{\fldrslt \cf4 \strokec4 indexOf()}}.\
}