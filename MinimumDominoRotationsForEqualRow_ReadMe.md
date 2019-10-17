{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 In a row of dominoes,\'a0
\f1\fs26 \cf4 \cb5 \strokec4 A[i]
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 B[i]
\f0\fs28 \cf2 \cb3 \strokec2 \'a0represent the top and bottom halves of the\'a0
\f1\fs26 \cf4 \cb5 \strokec4 i
\f0\fs28 \cf2 \cb3 \strokec2 -th domino.\'a0 (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)\
We may rotate the\'a0
\f1\fs26 \cf4 \cb5 \strokec4 i
\f0\fs28 \cf2 \cb3 \strokec2 -th domino, so that\'a0
\f1\fs26 \cf4 \cb5 \strokec4 A[i]
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 B[i]
\f0\fs28 \cf2 \cb3 \strokec2 \'a0swap values.\
Return the minimum number of rotations so that all the values in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 A
\f0\fs28 \cf2 \cb3 \strokec2 \'a0are the same, or all the values in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 B
\f0\fs28 \cf2 \cb3 \strokec2 \'a0are the same.\
If it cannot be done, return\'a0
\f1\fs26 \cf4 \cb5 \strokec4 -1
\f0\fs28 \cf2 \cb3 \strokec2 .\
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb1 \pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 A = [2,1,2,4,2,2], B = [5,2,6,2,3,2]\

\f3\b Output: 
\f4\b0 2\

\f3\b Explanation: 
\f4\b0 \
The first figure represents the dominoes as given by A and B: before we do any rotations.\
If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 A = [3,5,1,2,3], B = [3,6,3,3,4]\

\f3\b Output: 
\f4\b0 -1\

\f3\b Explanation: 
\f4\b0 \
In this case, it is not possible to rotate the dominoes to make one row of values equal.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 1 <= A[i], B[i] <= 6
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 2 <= A.length == B.length <= 20000
\f0\fs28 \cf2 \cb1 \strokec2 \
}