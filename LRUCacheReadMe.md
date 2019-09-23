{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red78\green106\blue120;
\red67\green91\blue103;\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c37647\c49020\c54510;
\cssrgb\c32941\c43137\c47843;\cssrgb\c96863\c97647\c98039;}
\margl1440\margr1440\vieww28600\viewh17500\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Design and implement a data structure for\'a0{\field{\*\fldinst{HYPERLINK "https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU"}}{\fldrslt \cf4 \strokec4 Least Recently Used (LRU) cache}}. It should support the following operations:\'a0
\f1\fs26 \cf5 \cb6 \strokec5 get
\f0\fs28 \cf2 \cb3 \strokec2 \'a0and\'a0
\f1\fs26 \cf5 \cb6 \strokec5 put
\f0\fs28 \cf2 \cb3 \strokec2 .\
\pard\pardeftab720\sl300\sa280\partightenfactor0

\f1\fs26 \cf5 \cb6 \strokec5 get(key)
\f0\fs28 \cf2 \cb3 \strokec2 \'a0- Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.\cb1 \uc0\u8232 
\f1\fs26 \cf5 \cb6 \strokec5 put(key, value)
\f0\fs28 \cf2 \cb3 \strokec2 \'a0- Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.\
\pard\pardeftab720\sl340\sa280\partightenfactor0
\cf2 The cache is initialized with a\'a0
\f2\b positive
\f0\b0 \'a0capacity.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Follow up:
\f0\b0 \cb1 \uc0\u8232 \cb3 Could you do both operations in\'a0
\f2\b O(1)
\f0\b0 \'a0time complexity?\

\f2\b Example:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\fs26 \cf2 \cb6 LRUCache cache = new LRUCache( 2 /* capacity */ );\
\
cache.put(1, 1);\
cache.put(2, 2);\
cache.get(1);       // returns 1\
cache.put(3, 3);    // evicts key 2\
cache.get(2);       // returns -1 (not found)\
cache.put(4, 4);    // evicts key 1\
cache.get(1);       // returns -1 (not found)\
cache.get(3);       // returns 3\
cache.get(4);       // returns 4\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \'a0\
}