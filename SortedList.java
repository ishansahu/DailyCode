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
    public ListNode sortList(ListNode head) \{\
        if(head == null || head.next == null)\
            return head;\
        ListNode first = head;\
        ListNode second = head;\
        ListNode last = head;\
        \
        while(last !=null && last.next !=null)\{\
            first = second;\
            second = second.next;\
            last = last.next.next;\
        \}\
        first.next =null;\
        \
        ListNode l1 = sortList(head);\
        ListNode l2 = sortList(second);\
        return mergeList(l1,l2);\
    \}\
    \
    public ListNode mergeList(ListNode l1, ListNode l2)\{\
        ListNode head = new ListNode(0);\
        ListNode p1 = head;\
        \
        while(l1 != null && l2 != null)\{\
            if(l1.val < l2.val)\{\
                p1.next = l1;\
                l1 = l1.next;\
            \}else\{\
                p1.next = l2;\
                l2 = l2.next;\
            \} \
            p1 = p1.next;\
        \}\
        if(l1 != null)\{\
            p1.next =l1;\
        \}\
        if(l2 != null)\{\
            p1.next =l2;\
        \}\
        return head.next;\
    \}\
    \
\}}