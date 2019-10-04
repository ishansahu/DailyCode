{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> letterCombinations(String digits) \{\
        if(digits == null || digits.length() == 0) return new ArrayList<String>();\
        \
        List<String> result = new ArrayList<>();\
        String[] mapping = \{\
            "0",\
            "1",\
            "abc",\
            "def",\
            "ghi",\
            "jkl",\
            "mno",\
            "pqrs",\
            "tuv",\
            "wxyz"\
        \};\
        helper(result, mapping, digits, 0, "");\
        return result;\
    \}\
    \
    \
    public void helper(List<String> result, String[] mapping, String digits, int index, String current )\{\
        \
        if(index == digits.length())\{\
            result.add(current);\
            return ;\
        \}else\{\
            String letters = mapping[digits.charAt(index) - '0'] ;\
            for(int i=0; i<letters.length() ; i++)\{\
                helper(result, mapping, digits, index+1, current + letters.charAt(i));             \}\
        \}  \
    \}\
\}}