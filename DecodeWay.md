{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 Menlo-Regular;
\f3\fnil\fcharset0 HelveticaNeue-Bold;\f4\fnil\fcharset0 Menlo-Bold;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 A message containing letters from\'a0
\f1\fs26 \cf4 \cb5 \strokec4 A-Z
\f0\fs28 \cf2 \cb3 \strokec2 \'a0is being encoded to numbers using the following mapping:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb5 'A' -> 1\
'B' -> 2\
...\
'Z' -> 26\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 Given a\'a0
\f3\b non-empty
\f0\b0 \'a0string containing only digits, determine the total number of ways to decode it.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f3\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f4\b\fs26 \cf2 \cb5 Input:
\f2\b0  "12"\

\f4\b Output:
\f2\b0  2\

\f4\b Explanation:
\f2\b0 \'a0It could be decoded as "AB" (1 2) or "L" (12).\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f3\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f4\b\fs26 \cf2 \cb5 Input:
\f2\b0  "226"\

\f4\b Output:
\f2\b0  3\

\f4\b Explanation:
\f2\b0 \'a0It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).\
}