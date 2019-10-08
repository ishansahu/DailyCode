{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;\f4\fnil\fcharset0 HelveticaNeue-Bold;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.\
Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".\
We are given a list\'a0
\f1\fs26 \cf4 \cb5 \strokec4 cpdomains
\f0\fs28 \cf2 \cb3 \strokec2 \'a0of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.\
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Example 1:
\f3\b0 \

\f2\b Input:
\f3\b0  \
["9001 discuss.leetcode.com"]\

\f2\b Output:
\f3\b0  \
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]\

\f2\b Explanation:
\f3\b0  \
We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.\
\

\f2\b Example 2:
\f3\b0 \

\f2\b Input:
\f3\b0  \
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]\

\f2\b Output:
\f3\b0  \
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]\

\f2\b Explanation:
\f3\b0  \
We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.\
\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f4\b\fs28 \cf2 \cb3 Notes:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The length of\'a0
\f1\fs26 \cf4 \cb5 \strokec4 cpdomains
\f0\fs28 \cf2 \cb3 \strokec2 \'a0will not exceed\'a0
\f1\fs26 \cf4 \cb5 \strokec4 100
\f0\fs28 \cf2 \cb3 \strokec2 .\'a0\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The length of each domain name will not exceed\'a0
\f1\fs26 \cf4 \cb5 \strokec4 100
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Each address will have either 1 or 2 "." characters.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The input count\'a0in any count-paired domain will not exceed\'a0
\f1\fs26 \cf4 \cb5 \strokec4 10000
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The answer output can be returned in any order.\cb1 \
}