{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fmodern\fcharset0 Courier;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a\'a0
\f1\b set
\f0\b0 \'a0of candidate numbers (
\f2\fs26 \cf4 \cb5 \strokec4 candidates
\f0\fs28 \cf2 \cb3 \strokec2 )\'a0
\f1\b (without duplicates)
\f0\b0 \'a0and a target number (
\f2\fs26 \cf4 \cb5 \strokec4 target
\f0\fs28 \cf2 \cb3 \strokec2 ), find all unique combinations in\'a0
\f2\fs26 \cf4 \cb5 \strokec4 candidates
\f0\fs28 \cf2 \cb3 \strokec2 \'a0where the candidate numbers sums to\'a0
\f2\fs26 \cf4 \cb5 \strokec4 target
\f0\fs28 \cf2 \cb3 \strokec2 .\
The\'a0
\f1\b same
\f0\b0 \'a0repeated number may be chosen from\'a0
\f2\fs26 \cf4 \cb5 \strokec4 candidates
\f0\fs28 \cf2 \cb3 \strokec2 \'a0unlimited number of times.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 All numbers (including\'a0
\f2\fs26 \cf4 \cb5 \strokec4 target
\f0\fs28 \cf2 \cb3 \strokec2 ) will be positive integers.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The solution set must not contain duplicate combinations.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 \cb3 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  candidates = [2,3,6,7], target = 7,\

\f3\b A solution set is:
\f4\b0 \
[\
  [7],\
  [2,2,3]\
]\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  candidates = [2,3,5], target = 8,\

\f3\b A solution set is:
\f4\b0 \
[\
\'a0 [2,2,2,2],\
\'a0 [2,3,3],\
\'a0 [3,5]\
]\
}