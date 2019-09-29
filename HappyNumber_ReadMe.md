{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Write an algorithm to determine if a number is "happy".\
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example:\'a0
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  19\

\f2\b Output:
\f3\b0  true\

\f2\b Explanation: \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b0 \cf2 1
\fs19\fsmilli9750 2
\fs26  + 9
\fs19\fsmilli9750 2
\fs26  = 82\
8
\fs19\fsmilli9750 2
\fs26  + 2
\fs19\fsmilli9750 2
\fs26  = 68\
6
\fs19\fsmilli9750 2
\fs26  + 8
\fs19\fsmilli9750 2
\fs26  = 100\
1
\fs19\fsmilli9750 2
\fs26  + 0
\fs19\fsmilli9750 2
\fs26  + 0
\fs19\fsmilli9750 2
\fs26  = 1\
}