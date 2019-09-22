{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
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
    public boolean isSubtree(TreeNode s, TreeNode t) \{\
        \
        while(s != null)\{\
            if(s.val == t.val && checkTree(s,t) )\{\
                return true;\
            \} else\{\
               return isSubtree(s.left,t) || isSubtree(s.right,t) ;\
            \}\
        \}\
        return false;\
    \}\
    \
    public boolean checkTree(TreeNode S1, TreeNode S2)\{\
        if(S1 == null && S2 == null)\
            return true;\
        if(S1 == null || S2 == null) return false;\
        if(S1.val == S2.val && checkTree(S1.left, S2.left) && checkTree(S1.right, S2.right) )\
            return true;\
        return false;\
    \}\
\}}