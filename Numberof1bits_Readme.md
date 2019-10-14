{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;\f4\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red245\green247\blue249;\red67\green91\blue103;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c96863\c97647\c98039;\cssrgb\c32941\c43137\c47843;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Write a function that takes an unsigned integer and return\'a0the number of '1'\'a0bits it has (also known as the\'a0{\field{\*\fldinst{HYPERLINK "http://en.wikipedia.org/wiki/Hamming_weight"}}{\fldrslt \cf4 \strokec4 Hamming weight}}).\
\'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:
\f3\b0  00000000000000000000000000001011\

\f2\b Output:
\f3\b0  3\

\f2\b Explanation: 
\f3\b0 The input binary string 
\f2\b 00000000000000000000000000001011
\f3\b0 \'a0has a total of three '1' bits.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:
\f3\b0  00000000000000000000000010000000\

\f2\b Output:
\f3\b0  1\

\f2\b Explanation: 
\f3\b0 The input binary string 
\f2\b 00000000000000000000000010000000
\f3\b0 \'a0has a total of one '1' bit.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 3:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:
\f3\b0  11111111111111111111111111111101\

\f2\b Output:
\f3\b0  31\

\f2\b Explanation: 
\f3\b0 The input binary string 
\f2\b 11111111111111111111111111111101
\f3\b0  has a total of thirty one '1' bits.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as signed integer type and should not affect your implementation, as the internal binary representation of the integer is the same whether it is signed or unsigned.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 In Java,\'a0the compiler represents the signed integers using\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/Two%27s_complement"}}{\fldrslt \cf4 \strokec4 2's complement notation}}. Therefore, in\'a0
\f1\b Example 3
\f0\b0 \'a0above the input represents the signed integer\'a0
\f4\fs26 \cf6 \cb5 \strokec6 -3
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 \'a0\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Follow up
\f0\b0 :\
If this function is called many times, how would you optimize it?\
}