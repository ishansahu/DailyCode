{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a text file\'a0
\f1\fs26 \cf4 \cb5 \strokec4 file.txt
\f0\fs28 \cf2 \cb3 \strokec2 \'a0that contains list of phone numbers (one per line), write a one liner bash script to print all valid phone numbers.\
You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)\
You may also assume each line in the text file must not contain leading or trailing white spaces.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example:
\f0\b0 \
Assume that\'a0
\f1\fs26 \cf4 \cb5 \strokec4 file.txt
\f0\fs28 \cf2 \cb3 \strokec2 \'a0has the following content:\
\pard\pardeftab720\sl400\partightenfactor0

\f3\fs26 \cf2 \cb5 987-123-4567\
123 456 7890\
(123) 456-7890\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 Your script should output the following valid phone numbers:\
\pard\pardeftab720\sl400\partightenfactor0

\f3\fs26 \cf2 \cb5 987-123-4567\
(123) 456-7890\
}