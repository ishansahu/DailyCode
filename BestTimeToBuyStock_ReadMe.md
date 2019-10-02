{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
\red98\green98\blue98;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
\cssrgb\c45882\c45882\c45882;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Say you have an array for which the\'a0
\i i
\i0\fs21 th
\fs28 \'a0element is the price of a given stock on day\'a0
\i i
\i0 .\cb1 \
\cb3 If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.\cb1 \
\cb3 Note that you cannot sell a stock before you buy one.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 \cb3 Example 1:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  [7,1,5,3,6,4]\

\f2\b Output:
\f3\b0  5\

\f2\b Explanation:
\f3\b0  Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.\
\'a0            Not 7-1 = 6, as selling price needs to be larger than buying price.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  [7,6,4,3,1]\

\f2\b Output:
\f3\b0  0\

\f2\b Explanation:
\f3\b0  In this case, no transaction is done, i.e. max profit = 0.\
\pard\pardeftab720\sl400\partightenfactor0

\f0 \cf5 \cb3 \strokec5 Accepted\cb1 \
}