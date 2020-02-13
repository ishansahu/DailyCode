{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.\
Return a\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/Object_copying#Deep_copy"}}{\fldrslt 
\f1\b \cf4 \strokec4 deep copy}}\'a0of the list.\
\'a0\

\f1\b Example 1:
\f0\b0 \

\f1\b \cb1 
\f0\b0 \cb3 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input:\

\f3\b0 \{"$id":"1","next":\{"$id":"2","next":null,"random":\{"$ref":"2"\},"val":2\},"random":\{"$ref":"2"\},"val":1\}\
\

\f2\b Explanation:\

\f3\b0 Node 1's value is 1, both of its next and random pointer points to Node 2.\
Node 2's value is 2, its next pointer points to null and its random pointer points to itself.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\

\f1\b Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 You must return the\'a0
\f1\b copy of the given head
\f0\b0 \'a0as a reference to the cloned list.\cb1 \
}