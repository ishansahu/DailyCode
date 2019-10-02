{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class RandomizedSet \{\
        HashMap<Integer, Integer> map;\
        ArrayList<Integer> list;\
        java.util.Random r = new java.util.Random();\
    /** Initialize your data structure here. */\
    public RandomizedSet() \{\
        map = new HashMap<Integer, Integer>();\
        list = new ArrayList<Integer>();\
    \}\
    \
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */\
    public boolean insert(int val) \{\
        if (map.containsKey(val)) return false;\
        map.put(val, list.size() );\
        list.add(val);\
        return true;\
    \}\
    \
    /** Removes a value from the set. Returns true if the set contained the specified element. */\
    public boolean remove(int val) \{\
        if (! map.containsKey(val)) return false;\
        int loc = map.get(val);\
        if(loc < list.size() - 1)\{\
            int temp = list.get(list.size() - 1);\
            list.set(loc,temp);\
            map.put(temp, loc);\
        \}\
        map.remove(val);\
        list.remove(list.size() -1);\
        return true;\
    \}\
    \
    /** Get a random element from the set. */\
    public int getRandom() \{\
         return list.get( r.nextInt(list.size()));    \
        \
    \}\
\}\
\
/**\
 * Your RandomizedSet object will be instantiated and called as such:\
 * RandomizedSet obj = new RandomizedSet();\
 * boolean param_1 = obj.insert(val);\
 * boolean param_2 = obj.remove(val);\
 * int param_3 = obj.getRandom();\
 */}