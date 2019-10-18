{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;\f2\fnil\fcharset0 Menlo-Bold;
\f3\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red245\green247\blue249;
}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c96863\c97647\c98039;
}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a\'a0
\f1\b non-empty
\f0\b0 \'a0string\'a0
\i s
\i0 \'a0and a dictionary\'a0
\i wordDict
\i0 \'a0containing a list of\'a0
\f1\b non-empty
\f0\b0 \'a0words, determine if\'a0
\i s
\i0 \'a0can be segmented into a space-separated sequence of one or more dictionary words.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The same word in the dictionary may be reused multiple times in the segmentation.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 You may assume the dictionary does not contain duplicate words.\cb1 \
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b \cf2 \cb3 Example 1:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  s = "leetcode", wordDict = ["leet", "code"]\

\f2\b Output:
\f3\b0  true\

\f2\b Explanation:
\f3\b0  Return true because "leetcode" can be segmented as "leet code".\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 2:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  s = "applepenapple", wordDict = ["apple", "pen"]\

\f2\b Output:
\f3\b0  true\

\f2\b Explanation:
\f3\b0  Return true because "applepenapple" can be segmented as "apple pen apple".\
\'a0            Note that you are allowed to reuse a dictionary word.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f1\b\fs28 \cf2 \cb3 Example 3:
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f2\b\fs26 \cf2 \cb4 Input:
\f3\b0  s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]\

\f2\b Output:
\f3\b0  false\
}