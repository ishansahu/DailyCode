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
    Integer sum =Integer.MAX_VALUE, pre =null;\
    public int minDiffInBST(TreeNode root) \{\
        if(root.left != null) minDiffInBST(root.left);\
        if(pre !=null) sum = Math.min(root.val - pre, sum );\
        pre = root.val;\
        if(root.right != null) minDiffInBST(root.right);\
        return sum;\
    \}\
\}}