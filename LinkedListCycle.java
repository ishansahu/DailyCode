{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for singly-linked list.\
 * class ListNode \{\
 *     int val;\
 *     ListNode next;\
 *     ListNode(int x) \{\
 *         val = x;\
 *         next = null;\
 *     \}\
 * \}\
 */\
public class Solution \{\
    \
    public boolean hasCycle(ListNode head) \{\
        if(head == null || head.next == null) return false;\
        ListNode slow = head, fast = head;\
        while(fast != null && fast.next != null)\{\
            slow = slow.next;\
            fast = fast.next.next;\
            if(fast == slow)\
                return true;\
        \}\
        return false;\
    \}\
    public boolean hasCycle_hashmap(ListNode head) \{\
        if(head == null || head.next == null) return false;\
        HashMap<ListNode, Integer> map = new HashMap<ListNode,Integer>();\
        while(head != null)\{\
            if (!map.containsKey(head))\{\
                map.put(head, 1);\
                head = head.next;\
            \} else return true;\
        \}\
        return false;\
    \}\
\}}