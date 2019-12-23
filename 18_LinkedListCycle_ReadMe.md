{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a linked list, determine if it has a cycle in it.\
To represent a cycle in the given linked list, we use an integer\'a0
\f1\fs26 \cf4 \cb5 \strokec4 pos
\f0\fs28 \cf2 \cb3 \strokec2 \'a0which represents the position (0-indexed)\'a0in the linked list where tail connects to. If\'a0
\f1\fs26 \cf4 \cb5 \strokec4 pos
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is\'a0
\f1\fs26 \cf4 \cb5 \strokec4 -1
\f0\fs28 \cf2 \cb3 \strokec2 , then there is no cycle in the linked list.\
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 head = [3,2,0,-4], pos = 1\

\f3\b Output: 
\f4\b0 true\

\f3\b Explanation:
\f4\b0  There is a cycle in the linked list, where tail connects to the second node.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 head = [1,2], pos = 0\

\f3\b Output: 
\f4\b0 true\

\f3\b Explanation:
\f4\b0  There is a cycle in the linked list, where tail connects to the first node.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Example 3:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 head = [1], pos = -1\

\f3\b Output: 
\f4\b0 false\

\f3\b Explanation:
\f4\b0  There is no cycle in the linked list.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb1 \pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Follow up:
\f0\b0 \
Can you solve it using\'a0
\i O(1)
\i0 \'a0(i.e. constant) memory?\
}