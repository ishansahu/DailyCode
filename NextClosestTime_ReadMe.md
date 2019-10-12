{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.\
You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  "19:34"\

\f2\b Output:
\f3\b0  "19:39"\

\f2\b Explanation:
\f3\b0  The next closest time choosing from digits 
\f2\b 1
\f3\b0 , 
\f2\b 9
\f3\b0 , 
\f2\b 3
\f3\b0 , 
\f2\b 4
\f3\b0 , is 
\f2\b 19:39
\f3\b0 , which occurs 5 minutes later.  It is not 
\f2\b 19:33
\f3\b0 , because this occurs 23 hours and 59 minutes later.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  "23:59"\

\f2\b Output:
\f3\b0  "22:22"\

\f2\b Explanation:
\f3\b0  The next closest time choosing from digits 
\f2\b 2
\f3\b0 , 
\f2\b 3
\f3\b0 , 
\f2\b 5
\f3\b0 , 
\f2\b 9
\f3\b0 , is 
\f2\b 22:22
\f3\b0 . It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.\
}