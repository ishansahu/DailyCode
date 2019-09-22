{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Regular;
}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given two non-empty binary trees\'a0
\f1\b s
\f0\b0 \'a0and\'a0
\f1\b t
\f0\b0 , check whether tree\'a0
\f1\b t
\f0\b0 \'a0has exactly the same structure and node values with a subtree of\'a0
\f1\b s
\f0\b0 . A subtree of\'a0
\f1\b s
\f0\b0 \'a0is a tree consists of a node in\'a0
\f1\b s
\f0\b0 \'a0and all of this node's descendants. The tree\'a0
\f1\b s
\f0\b0 \'a0could also be considered as a subtree of itself.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \cb1 \uc0\u8232 \cb3 Given tree s:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb4      3\
    / \\\
   4   5\
  / \\\
 1   2\
\pard\pardeftab720\sl340\partightenfactor0

\f0\fs28 \cf2 \cb3 Given tree t:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb4    4 \
  / \\\
 1   2\
\pard\pardeftab720\sl340\partightenfactor0

\f0\fs28 \cf2 \cb3 Return\'a0
\f1\b true
\f0\b0 , because t has the same structure and node values with a subtree of s.\
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 2:
\f0\b0 \cb1 \uc0\u8232 \cb3 Given tree s:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb4      3\
    / \\\
   4   5\
  / \\\
 1   2\
    /\
   0\
\pard\pardeftab720\sl340\partightenfactor0

\f0\fs28 \cf2 \cb3 Given tree t:\
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb4    4\
  / \\\
 1   2\
\pard\pardeftab720\sl340\partightenfactor0

\f0\fs28 \cf2 \cb3 Return\'a0
\f1\b false
\f0\b0 .}