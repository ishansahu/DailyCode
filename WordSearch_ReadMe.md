{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Regular;
\f3\fnil\fcharset0 Menlo-Bold;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a 2D board and a word, find if the word exists in the grid.\
The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf2 \cb4 board =\
[\
  ['A','B','C','E'],\
  ['S','F','C','S'],\
  ['A','D','E','E']\
]\
\
Given word = "
\f3\b ABCCED
\f2\b0 ", return 
\f3\b true
\f2\b0 .\
Given word = "
\f3\b SEE
\f2\b0 ", return 
\f3\b true
\f2\b0 .\
Given word = "
\f3\b ABCB
\f2\b0 ", return 
\f3\b false
\f2\b0 .\
}