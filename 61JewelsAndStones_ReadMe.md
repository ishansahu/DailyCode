{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
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
\outl0\strokewidth0 \strokec2 You're given strings\'a0
\f1\fs26 \cf4 \cb5 \strokec4 J
\f0\fs28 \cf2 \cb3 \strokec2 \'a0representing the types of stones that are jewels, and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 S
\f0\fs28 \cf2 \cb3 \strokec2 \'a0representing the stones you have.\'a0 Each character in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 S
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is a type of stone you have.\'a0 You want to know how many of the stones you have are also jewels.\
The letters in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 J
\f0\fs28 \cf2 \cb3 \strokec2 \'a0are guaranteed distinct, and all characters in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 J
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 S
\f0\fs28 \cf2 \cb3 \strokec2 \'a0are letters. Letters are case sensitive, so\'a0
\f1\fs26 \cf4 \cb5 \strokec4 "a"
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is considered a different type of stone from\'a0
\f1\fs26 \cf4 \cb5 \strokec4 "A"
\f0\fs28 \cf2 \cb3 \strokec2 .\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  J = "aA", S = "aAAbbbb"\

\f3\b Output:
\f4\b0  3\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  J = "z", S = "ZZ"\

\f3\b Output:
\f4\b0  0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls1\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 S
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 J
\f0\fs28 \cf2 \cb3 \strokec2 \'a0will consist of letters and have length at most 50.\cb1 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The characters in\'a0
\f1\fs26 \cf4 \cb5 \strokec4 J
\f0\fs28 \cf2 \cb3 \strokec2 \'a0are distinct.\cb1 \
}