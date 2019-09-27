{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid101\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid2}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 According to the\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life"}}{\fldrslt \cf4 \strokec4 Wikipedia's article}}: "The\'a0
\f1\b Game of Life
\f0\b0 , also known simply as\'a0
\f1\b Life
\f0\b0 , is a cellular automaton devised by the British mathematician John Horton Conway in 1970."\
Given a\'a0
\i board
\i0 \'a0with\'a0
\i m
\i0 \'a0by\'a0
\i n
\i0 \'a0cells, each cell has an initial state\'a0
\i live
\i0 \'a0(1) or\'a0
\i dead
\i0 \'a0(0). Each cell interacts with its\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/Moore_neighborhood"}}{\fldrslt \cf4 \strokec4 eight neighbors}}\'a0(horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Any live cell with fewer than two live neighbors dies, as if caused by under-population.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Any live cell with two or three live neighbors lives on to the next generation.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	3.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Any live cell with more than three live neighbors dies, as if by over-population..\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	4.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \cb3 Write a function to compute the next state (after one update) of the board given its current state.\'a0The next state is created by applying the above rules simultaneously to every cell in the current state, where\'a0births and deaths occur simultaneously.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb5 Input: \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b0 \cf2 [\
\'a0 [0,1,0],\
\'a0 [0,0,1],\
\'a0 [1,1,1],\
\'a0 [0,0,0]\
]\
\pard\pardeftab720\sl400\partightenfactor0

\f2\b \cf2 Output: \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b0 \cf2 [\
\'a0 [0,0,0],\
\'a0 [1,0,1],\
\'a0 [0,1,1],\
\'a0 [0,1,0]\
]\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Follow up
\f0\b0 :\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls2\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?\cb1 \
}