{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;\red98\green98\blue98;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;\cssrgb\c45882\c45882\c45882;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 We have a list of\'a0
\f1\fs26 \cf4 \cb5 \strokec4 points
\f0\fs28 \cf2 \cb3 \strokec2 \'a0on the plane.\'a0 Find the\'a0
\f1\fs26 \cf4 \cb5 \strokec4 K
\f0\fs28 \cf2 \cb3 \strokec2 \'a0closest points to the origin\'a0
\f1\fs26 \cf4 \cb5 \strokec4 (0, 0)
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\cb3 (Here, the distance between two points on a plane is the Euclidean distance.)\cb1 \
\cb3 You may return the answer in any order.\'a0 The\'a0answer is guaranteed to be unique (except for the order that it is in.)\cb1 \
\cb3 \'a0\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 points = [[1,3],[-2,2]], K = 1\

\f3\b Output: 
\f4\b0 [[-2,2]]\

\f3\b Explanation: 
\f4\b0 \
The distance between (1, 3) and the origin is sqrt(10).\
The distance between (-2, 2) and the origin is sqrt(8).\
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.\
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 points = [[3,3],[5,-1],[-2,4]], K = 2\

\f3\b Output: 
\f4\b0 [[3,3],[-2,4]]\
(The answer [[-2,4],[3,3]] would also be accepted.)\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Note:
\f0\b0 \cb1 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 1 <= K <= points.length <= 10000
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 -10000 < points[i][0] < 10000
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	3.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 -10000 < points[i][1] < 10000
\f0\fs28 \cf2 \cb1 \strokec2 \
\pard\pardeftab720\sl400\partightenfactor0

\fs26 \cf6 \cb3 \strokec6 Accepted\cb1 \
}