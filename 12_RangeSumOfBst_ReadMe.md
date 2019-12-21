{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given the\'a0
\f1\fs26 \cf4 \cb5 \strokec4 root
\f0\fs28 \cf2 \cb3 \strokec2 \'a0node of a binary search tree, return the sum of values of all nodes with value between\'a0
\f1\fs26 \cf4 \cb5 \strokec4 L
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 R
\f0\fs28 \cf2 \cb3 \strokec2 \'a0(inclusive).\
The binary search tree is guaranteed to have unique values.\
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 root = [10,5,15,3,7,null,18], L = 7, R = 15\

\f3\b Output: 
\f4\b0 32\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10\

\f3\b Output: 
\f4\b0 23\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Note:
\f0\b0 \cb1 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The number of nodes in the tree is at most\'a0
\f1\fs26 \cf4 \cb5 \strokec4 10000
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The final answer is guaranteed to be less than\'a0
\f1\fs26 \cf4 \cb5 \strokec4 2^31
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
}