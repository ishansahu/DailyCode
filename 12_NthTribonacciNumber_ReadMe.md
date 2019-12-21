{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;\cssrgb\c0\c0\c0\c65098;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The Tribonacci sequence T
\fs21 n
\fs28 \'a0is defined as follows:\'a0\cb1 \
\cb3 T
\fs21 0
\fs28 \'a0= 0, T
\fs21 1
\fs28 \'a0= 1, T
\fs21 2
\fs28 \'a0= 1, and T
\fs21 n+3
\fs28 \'a0= T
\fs21 n
\fs28 \'a0+ T
\fs21 n+1
\fs28 \'a0+ T
\fs21 n+2
\fs28 \'a0for n >= 0.\cb1 \
\cb3 Given\'a0
\f1\fs26 \cf4 \cb5 \strokec4 n
\f0\fs28 \cf2 \cb3 \strokec2 , return the value of T
\fs21 n
\fs28 .\cb1 \
\cb3 \'a0\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  n = 4\

\f3\b Output:
\f4\b0  4\

\f3\b Explanation:
\f4\b0 \
T_3 = 0 + 1 + 1 = 2\
T_4 = 1 + 1 + 2 = 4\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  n = 25\

\f3\b Output:
\f4\b0  1389537\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 \cb3 Constraints:
\f0\b0 \cb1 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 0 <= n <= 37
\f0\fs28 \cf2 \cb1 \strokec2 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The answer is guaranteed to fit within a 32-bit integer, ie.\'a0
\f1\fs26 \cf4 \cb5 \strokec4 answer <= 2^31 - 1
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\fs26 \cf6 \strokec6 \
}