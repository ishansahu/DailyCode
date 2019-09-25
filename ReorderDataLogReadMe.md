{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid101\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid2}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 You have an array of\'a0
\f1\fs26 \cf4 \cb5 \strokec4 logs
\f0\fs28 \cf2 \cb3 \strokec2 .\'a0 Each log is a space delimited string of words.\
For each log, the first word in each log is an alphanumeric\'a0
\i identifier
\i0 .\'a0 Then, either:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Each word after the identifier will consist only of lowercase letters, or;\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Each word after the identifier will consist only of digits.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 We will call these two varieties of logs\'a0
\i letter-logs
\i0 \'a0and\'a0
\i digit-logs
\i0 .\'a0 It is guaranteed that each log has at least one word after its identifier.\
Reorder the logs so that all of the letter-logs come before any digit-log.\'a0 The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.\'a0 The digit-logs should be put in their original order.\
Return the final order of the logs.\
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]\

\f3\b Output:
\f4\b0  ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Constraints:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls2\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 0 <= logs.length <= 100
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls2\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 3 <= logs[i].length <= 100
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls2\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	3.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 logs[i]
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is guaranteed to have an identifier, and a word after the identifier.\cb1 \
}