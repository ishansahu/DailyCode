{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for singly-linked list.\
 * public class ListNode \{\
 *     int val;\
 *     ListNode next;\
 *     ListNode(int x) \{ val = x; \}\
 * \}\
 */\
class Solution \{\
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) \{\
        if(l1 == null && l2 == null)\
            return null;\
        ListNode prehead = new ListNode(-1);\
        ListNode sortedNode = prehead;\
        while (l1 != null && l2 != null)\{\
            if(l1.val <=  l2.val)\{\
                sortedNode.next = new ListNode(l1.val);\
                l1 = l1.next;\
            \}else\{\
                sortedNode.next = new ListNode(l2.val);\
                l2 = l2.next;\
            \}\
            sortedNode = sortedNode.next;\
        \}\
        sortedNode.next = l1 == null ? l2 : l1;\
        return prehead.next;\
    \}\
\}}