{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given an encoded string, return its decoded string.\
The encoding rule is:\'a0
\f1\fs26 \cf4 \cb5 \strokec4 k[encoded_string]
\f0\fs28 \cf2 \cb3 \strokec2 , where the\'a0
\i encoded_string
\i0 \'a0inside the square brackets is being repeated exactly\'a0
\i k
\i0 \'a0times. Note that\'a0
\i k
\i0 \'a0is guaranteed to be a positive integer.\
You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.\
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers,\'a0
\i k
\i0 . For example, there won't be input like\'a0
\f1\fs26 \cf4 \cb5 \strokec4 3a
\f0\fs28 \cf2 \cb3 \strokec2 \'a0or\'a0
\f1\fs26 \cf4 \cb5 \strokec4 2[4]
\f0\fs28 \cf2 \cb3 \strokec2 .\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Examples:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\fs26 \cf2 \cb5 s = "3[a]2[bc]", return "aaabcbc".\
s = "3[a2[c]]", return "accaccacc".\
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
}