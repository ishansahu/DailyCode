{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 Menlo-Regular;
}
{\colortbl;\red255\green255\blue255;\red78\green106\blue120;\red255\green255\blue255;\red29\green38\blue42;
\red67\green91\blue103;\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c37647\c49020\c54510;\cssrgb\c100000\c100000\c100000;\cssrgb\c14902\c19608\c21961;
\cssrgb\c32941\c43137\c47843;\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl340\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 SQL Schema\cf4 \strokec4 \
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf4 Table:\'a0
\f1\fs26 \cf5 \cb6 \strokec5 Person
\f0\fs28 \cf4 \cb1 \strokec4 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf4 \cb6 +-------------+---------+\
| Column Name | Type    |\
+-------------+---------+\
| PersonId    | int     |\
| FirstName   | varchar |\
| LastName    | varchar |\
+-------------+---------+\
PersonId is the primary key column for this table.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf4 \cb3 Table:\'a0
\f1\fs26 \cf5 \cb6 \strokec5 Address
\f0\fs28 \cf4 \cb1 \strokec4 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf4 \cb6 +-------------+---------+\
| Column Name | Type    |\
+-------------+---------+\
| AddressId   | int     |\
| PersonId    | int     |\
| City        | varchar |\
| State       | varchar |\
+-------------+---------+\
AddressId is the primary key column for this table.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf4 \cb3 \'a0\cb1 \
\cb3 Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:\cb1 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\fs26 \cf4 \cb6 FirstName, LastName, City, State\
}