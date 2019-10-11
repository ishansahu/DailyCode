{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset0 HelveticaNeue-Bold;
\f3\fnil\fcharset0 Menlo-Bold;\f4\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red29\green38\blue42;\red255\green255\blue255;\red67\green91\blue103;
\red245\green247\blue249;}
{\*\expandedcolortbl;;\cssrgb\c14902\c19608\c21961;\cssrgb\c100000\c100000\c100000;\cssrgb\c32941\c43137\c47843;
\cssrgb\c96863\c97647\c98039;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc0\levelnfcn0\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{decimal\}.}{\leveltext\leveltemplateid1\'02\'00.;}{\levelnumbers\'01;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\deftab720
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Given a Binary Search Tree (BST) with the root node\'a0
\f1\fs26 \cf4 \cb5 \strokec4 root
\f0\fs28 \cf2 \cb3 \strokec2 , return\'a0the minimum difference between the values of any two different nodes in the tree.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b \cf2 Example :
\f0\b0 \
\pard\pardeftab720\sl400\partightenfactor0

\f3\b\fs26 \cf2 \cb5 Input:
\f4\b0  root = [4,2,6,1,3,null,null]\

\f3\b Output:
\f4\b0  1\

\f3\b Explanation:
\f4\b0 \
Note that root is a TreeNode object, not an array.\
\
The given tree [4,2,6,1,3,null,null] is represented by the following diagram:\
\
          4\
        /   \\\
      2      6\
     / \\    \
    1   3  \
\
while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.\
\pard\pardeftab720\sl340\sa280\partightenfactor0

\f2\b\fs28 \cf2 \cb3 Note:
\f0\b0 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	1.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The size of the BST will be between 2 and\'a0
\f1\fs26 \cf4 \cb5 \strokec4 100
\f0\fs28 \cf2 \cb3 \strokec2 .\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	2.	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 The BST is always valid, each node's value is an integer, and each node's value is different.\cb1 \
}