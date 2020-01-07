{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a string containing just the characters\'a0
\f1\fs26 \cf4 \cb5 \strokec4 '('
\f0\fs28 \cf2 \cb3 \strokec2 ,\'a0
\f1\fs26 \cf4 \cb5 \strokec4 ')'
\f0\fs28 \cf2 \cb3 \strokec2 ,\'a0
\f1\fs26 \cf4 \cb5 \strokec4 '\{'
\f0\fs28 \cf2 \cb3 \strokec2 ,\'a0
\f1\fs26 \cf4 \cb5 \strokec4 '\}'
\f0\fs28 \cf2 \cb3 \strokec2 ,\'a0
\f1\fs26 \cf4 \cb5 \strokec4 '['
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 ']'
\f0\fs28 \cf2 \cb3 \strokec2 , determine if the input string is valid.\
An input string is valid if:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Open brackets must be closed by the same type of brackets.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Open brackets must be closed in the correct order.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 Note that an empty string is\'a0also considered valid.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  "()"\

\f3\b Output:
\f4\b0  true\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  "()[]\{\}"\

\f3\b Output:
\f4\b0  true\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 3:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  "(]"\

\f3\b Output:
\f4\b0  false\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 4:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  "([)]"\

\f3\b Output:
\f4\b0  false\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 5:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  "\{[]\}"\

\f3\b Output:
\f4\b0  true\
}