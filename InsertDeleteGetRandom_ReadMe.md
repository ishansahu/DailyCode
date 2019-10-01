{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fmodern\fcharset0 Courier;
\f3\fnil\fcharset0 Menlo-Regular;}
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
\outl0\strokewidth0 \strokec2 Design a data structure that supports all following operations in\'a0
\i average
\i0 \'a0
\f1\b O(1)
\f0\b0 \'a0time.\
\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls1\ilvl0
\f2\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 insert(val)
\f0\fs28 \cf2 \cb3 \strokec2 : Inserts an item val to the set if not already present.\cb1 \
\ls1\ilvl0
\f2\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 remove(val)
\f0\fs28 \cf2 \cb3 \strokec2 : Removes an item val from the set if present.\cb1 \
\ls1\ilvl0
\f2\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	3.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 getRandom
\f0\fs28 \cf2 \cb3 \strokec2 : Returns a random element from current set of elements. Each element must have the\'a0
\f1\b same probability
\f0\b0 \'a0of being returned.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\fs26 \cf2 \cb5 // Init an empty set.\
RandomizedSet randomSet = new RandomizedSet();\
\
// Inserts 1 to the set. Returns true as 1 was inserted successfully.\
randomSet.insert(1);\
\
// Returns false as 2 does not exist in the set.\
randomSet.remove(2);\
\
// Inserts 2 to the set, returns true. Set now contains [1,2].\
randomSet.insert(2);\
\
// getRandom should return either 1 or 2 randomly.\
randomSet.getRandom();\
\
// Removes 1 from the set, returns true. Set now contains [2].\
randomSet.remove(1);\
\
// 2 was already in the set, so return false.\
randomSet.insert(2);\
\
// Since 2 is the only number in the set, getRandom always return 2.\
randomSet.getRandom();\
}