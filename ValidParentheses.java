{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
\
  // Hash table that takes care of the mappings.\
  private HashMap<Character, Character> mappings;\
\
  // Initialize hash map with mappings. This simply makes the code easier to read.\
  public Solution() \{\
    this.mappings = new HashMap<Character, Character>();\
    this.mappings.put(')', '(');\
    this.mappings.put('\}', '\{');\
    this.mappings.put(']', '[');\
  \}\
\
  public boolean isValid(String s) \{\
\
    // Initialize a stack to be used in the algorithm.\
    Stack<Character> stack = new Stack<Character>();\
\
    for (int i = 0; i < s.length(); i++) \{\
      char c = s.charAt(i);\
\
      // If the current character is a closing bracket.\
      if (this.mappings.containsKey(c)) \{\
\
        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'\
        char topElement = stack.empty() ? '#' : stack.pop();\
\
        // If the mapping for this bracket doesn't match the stack's top element, return false.\
        if (topElement != this.mappings.get(c)) \{\
          return false;\
        \}\
      \} else \{\
        // If it was an opening bracket, push to the stack.\
        stack.push(c);\
      \}\
    \}\
\
    // If the stack still contains elements, then it is an invalid expression.\
    return stack.isEmpty();\
  \}\
\}}