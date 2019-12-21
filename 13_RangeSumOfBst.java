{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode(int x) \{ val = x; \}\
 * \}\
 */\
class Solution \{\
    public int rangeSumBST(TreeNode root, int L, int R) \{\
        if(root == null ) return 0;\
        if (root.val < L) return rangeSumBST(root.right, L, R); \
        if (root.val > R) return rangeSumBST(root.left, L, R); \
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);\
    \}\
\}}