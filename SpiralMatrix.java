{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> spiralOrder(int[][] matrix) \{\
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)\
            return new ArrayList();\
        \
        int top=0, bottom = matrix.length -1 ;\
        int left=0, right = matrix[0].length -1;\
        int dir=0;\
        List<Integer> list = new ArrayList<>();\
            \
        while(top <= bottom && left <= right)\{\
            if (dir == 0)\{\
                for(int i = left; i <= right; i++)\{\
                    list.add(matrix[top][i]);\
                \}\
                top++;\
            \}\
            else if (dir == 1)\{\
                for(int i = top; i <= bottom; i++)\{\
                    list.add(matrix[i][right]);\
                \}\
                right--;\
            \}\
            else if (dir == 2)\{\
                for(int i = right; i >= left; i--)\{\
                    list.add(matrix[bottom][i]);\
                \}\
                bottom--;\
            \}\
            else if (dir == 3)\{\
                for(int i = bottom; i >= top; i--)\{\
                    list.add(matrix[i][left]);\
                \}\
                left++;\
            \}\
            dir = (dir+1)%4;\
        \}    \
        return list;\
    \}\
\}}