{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.\
Given linked list --\'a0head =\'a0[4,5,1,9], which looks like following:\
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb1 \pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  head = [4,5,1,9], node = 5\

\f2\b Output:
\f3\b0  [4,1,9]\

\f2\b Explanation: 
\f3\b0 You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  head = [4,5,1,9], node = 1\

\f2\b Output:
\f3\b0  [4,5,9]\

\f2\b Explanation: 
\f3\b0 You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The linked list will have at least two elements.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 All of the nodes' values will be unique.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The given node\'a0will not be the tail and it will always be a valid node of the linked list.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Do not return anything from your function.\cb1 \
}