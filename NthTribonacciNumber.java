{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh7900\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Tri \{\
  private int n = 38;\
  public int[] nums = new int[n];\
\
  int helper(int k) \{\
    if (k == 0) return 0;\
    if (nums[k] != 0) return nums[k];\
\
    nums[k] = helper(k - 1) + helper(k - 2) + helper(k - 3);\
    return nums[k];\
  \}\
\
  Tri() \{\
    nums[1] = 1;\
    nums[2] = 1;\
    helper(n - 1);\
  \}\
\}\
\
class Solution \{\
  public static Tri t = new Tri();\
  public int tribonacci(int n) \{\
    return t.nums[n];\
  \}\
\}}