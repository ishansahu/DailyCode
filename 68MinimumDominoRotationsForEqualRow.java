{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Map.Entry; \
\
class Solution \{\
    public int minDominoRotations_mysol(int[] A, int[] B) \{\
        HashMap<Integer, Integer> map1 = new HashMap<>();\
        HashMap<Integer, Integer> map2 = new HashMap<>();\
        for(int a : A)\{\
            map1.put(a,map1.getOrDefault(a,0)+1);\
        \}\
        for(int a : B)\{\
            map2.put(a,map2.getOrDefault(a,0)+1);\
        \}\
        int maxA=0,resA = A[0],resB = B[0],maxB=0;\
        for(Entry<Integer, Integer> a: map1.entrySet())\{\
            if(maxA < a.getValue())\{\
                resA = a.getKey();\
                maxA = a.getValue();\
            \}\
        \}\
        for(Entry<Integer, Integer> a: map2.entrySet())\{\
            if(maxB < a.getValue())\{\
                resB = a.getKey();\
                maxB = a.getValue();\
            \}\
        \}\
        int rotate =0;\
        if(maxA > maxB)\{\
            for(int i=0; i < A.length; i++)\{\
                if(A[i] != resA && B[i] == resA) rotate++;\
                else if(A[i] != resA && B[i] != resA) return -1;\
            \}\
        \}else\{\
            for(int i=0; i < B.length; i++)\{\
                if(B[i] != resB && A[i] == resB) rotate++;\
                else if(B[i] != resB && A[i] != resB) return -1;\
            \}\
        \}\
        return rotate;\
    \}\
    \
    public int check(int x, int[] A, int[] B, int n) \{\
        int rotations_a = 0, rotations_b = 0;\
        for (int i = 0; i < n; i++) \{\
          if (A[i] != x && B[i] != x) return -1;\
          else if (A[i] != x) rotations_a++;\
          else if (B[i] != x) rotations_b++;\
        \}\
        return Math.min(rotations_a, rotations_b);\
  \}\
\
  public int minDominoRotations(int[] A, int[] B) \{\
    int n = A.length;\
    int rotations = check(A[0], B, A, n);\
    if (rotations != -1 || A[0] == B[0]) return rotations;\
    else return check(B[0], B, A, n);\
  \}\
    \
    \
\}}