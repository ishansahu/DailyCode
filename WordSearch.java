{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red245\green247\blue249;\red20\green0\blue196;
\red151\green0\blue126;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c96863\c97647\c98039;\cssrgb\c10980\c0\c81176;
\cssrgb\c66667\c5098\c56863;}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\deftab720
\pard\pardeftab720\sl400\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 public boolean exist(char[][] board, String word) \{\
    char[] w = word.toCharArray();\
    for (int \cf4 \strokec4 y\cf2 \strokec2 =\cf4 \strokec4 0\cf2 \strokec2 ; \cf4 \strokec4 y\cf2 \strokec2 <board.length; \cf4 \strokec4 y\cf2 \strokec2 ++) \{\
    	for (int \cf4 \strokec4 x\cf2 \strokec2 =\cf4 \strokec4 0\cf2 \strokec2 ; \cf4 \strokec4 x\cf2 \strokec2 <board[\cf4 \strokec4 y\cf2 \strokec2 ].length; \cf4 \strokec4 x\cf2 \strokec2 ++) \{\
    		if (exist(board, \cf4 \strokec4 y\cf2 \strokec2 , \cf4 \strokec4 x\cf2 \strokec2 , w, \cf4 \strokec4 0\cf2 \strokec2 )) return \cf5 \strokec5 true\cf2 \strokec2 ;\
    	\}\
    \}\
    return \cf5 \strokec5 false\cf2 \strokec2 ;\
\}\
\
private boolean exist(char[][] board, int \cf4 \strokec4 y\cf2 \strokec2 , int \cf4 \strokec4 x\cf2 \strokec2 , char[] word, int i) \{\
	if (i == word.length) return \cf5 \strokec5 true\cf2 \strokec2 ;\
	if (\cf4 \strokec4 y\cf2 \strokec2 <\cf4 \strokec4 0\cf2 \strokec2  || \cf4 \strokec4 x\cf2 \strokec2 <\cf4 \strokec4 0\cf2 \strokec2  || \cf4 \strokec4 y\cf2 \strokec2  == board.length || \cf4 \strokec4 x\cf2 \strokec2  == board[\cf4 \strokec4 y\cf2 \strokec2 ].length) return \cf5 \strokec5 false\cf2 \strokec2 ;\
	if (board[\cf4 \strokec4 y\cf2 \strokec2 ][\cf4 \strokec4 x\cf2 \strokec2 ] != word[i]) return \cf5 \strokec5 false\cf2 \strokec2 ;\
	board[\cf4 \strokec4 y\cf2 \strokec2 ][\cf4 \strokec4 x\cf2 \strokec2 ] ^= \cf4 \strokec4 256\cf2 \strokec2 ;\
	boolean exist = exist(board, \cf4 \strokec4 y\cf2 \strokec2 , \cf4 \strokec4 x\cf2 \strokec2 +\cf4 \strokec4 1\cf2 \strokec2 , word, i+\cf4 \strokec4 1\cf2 \strokec2 )\
		|| exist(board, \cf4 \strokec4 y\cf2 \strokec2 , \cf4 \strokec4 x-1\cf2 \strokec2 , word, i+\cf4 \strokec4 1\cf2 \strokec2 )\
		|| exist(board, \cf4 \strokec4 y\cf2 \strokec2 +\cf4 \strokec4 1\cf2 \strokec2 , \cf4 \strokec4 x\cf2 \strokec2 , word, i+\cf4 \strokec4 1\cf2 \strokec2 )\
		|| exist(board, \cf4 \strokec4 y-1\cf2 \strokec2 , \cf4 \strokec4 x\cf2 \strokec2 , word, i+\cf4 \strokec4 1\cf2 \strokec2 );\
	board[\cf4 \strokec4 y\cf2 \strokec2 ][\cf4 \strokec4 x\cf2 \strokec2 ] ^= \cf4 \strokec4 256\cf2 \strokec2 ;\
	return exist;\
\}\
}