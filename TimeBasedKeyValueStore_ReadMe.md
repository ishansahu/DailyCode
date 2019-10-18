{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid101\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid2}
{\list\listtemplateid3\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid201\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid3}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}{\listoverride\listid3\listoverridecount0\ls3}}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Create a timebased key-value store class\'a0
\f1\fs26 \cf4 \cb5 \strokec4 TimeMap
\f0\fs28 \cf2 \cb3 \strokec2 , that supports two operations.\
1.\'a0
\f1\fs26 \cf4 \cb5 \strokec4 set(string key, string value, int timestamp)
\f0\fs28 \cf2 \cb3 \strokec2 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Stores the\'a0
\f1\fs26 \cf4 \cb5 \strokec4 key
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 value
\f0\fs28 \cf2 \cb3 \strokec2 , along with the given\'a0
\f1\fs26 \cf4 \cb5 \strokec4 timestamp
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 2.\'a0
\f1\fs26 \cf4 \cb5 \strokec4 get(string key, int timestamp)
\f0\fs28 \cf2 \cb3 \strokec2 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls2\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Returns a value such that\'a0
\f1\fs26 \cf4 \cb5 \strokec4 set(key, value, timestamp_prev)
\f0\fs28 \cf2 \cb3 \strokec2 \'a0was called previously, with\'a0
\f1\fs26 \cf4 \cb5 \strokec4 timestamp_prev <= timestamp
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 If there are multiple such values, it returns the one with the largest\'a0
\f1\fs26 \cf4 \cb5 \strokec4 timestamp_prev
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 If there are no values, it returns the empty string (
\f1\fs26 \cf4 \cb5 \strokec4 ""
\f0\fs28 \cf2 \cb3 \strokec2 ).\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 inputs = ["TimeMap","set","get","get","set","get","get"], inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]\

\f3\b Output: 
\f4\b0 [null,null,"bar","bar",null,"bar2","bar2"]\

\f3\b Explanation: 
\f4\b0 \'a0 \
TimeMap kv; \'a0 \
kv.set("foo", "bar", 1); // store the key "foo" and value "bar" along with timestamp = 1 \'a0 \
kv.get("foo", 1);  // output "bar" \'a0 \
kv.get("foo", 3); // output "bar" since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 ie "bar" \'a0 \
kv.set("foo", "bar2", 4); \'a0 \
kv.get("foo", 4); // output "bar2" \'a0 \
kv.get("foo", 5); //output "bar2" \'a0 \
\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input: 
\f4\b0 inputs = ["TimeMap","set","set","get","get","get","get","get"], inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]\

\f3\b Output: 
\f4\b0 [null,null,null,"","high","high","low","low"]\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls3\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 All key/value strings are lowercase.\cb1 \
\ls3\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 All key/value strings have\'a0length in the range\'a0
\f1\fs26 \cf4 \cb5 \strokec4 [1, 100]
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls3\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	3.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The\'a0
\f1\fs26 \cf4 \cb5 \strokec4 timestamps
\f0\fs28 \cf2 \cb3 \strokec2 \'a0for all\'a0
\f1\fs26 \cf4 \cb5 \strokec4 TimeMap.set
\f0\fs28 \cf2 \cb3 \strokec2 \'a0operations are strictly increasing.\cb1 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl300\partightenfactor0
\ls3\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	4.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 1 <= timestamp <= 10^7
\f0\fs28 \cf2 \cb1 \strokec2 \
\ls3\ilvl0
\f1\fs26 \cf4 \cb5 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	5.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 TimeMap.set
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 TimeMap.get
\f0\fs28 \cf2 \cb3 \strokec2 \'a0functions will be called a total of\'a0
\f1\fs26 \cf4 \cb5 \strokec4 120000
\f0\fs28 \cf2 \cb3 \strokec2 \'a0times (combined) per test case.\cb1 \
}