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
    public ListNode removeNthFromEnd(ListNode head, int n) \{\
        ListNode header = new ListNode(0);\
        header.next = head;\
        ListNode first = header;\
        ListNode second = header;\
        for(int i=0; i <=n ; i++) first = first.next;\
        while (first != null)\{\
            first = first.next; \
            second = second.next;\
        \}\
        second.next = second.next.next;\
        return header.next;\
    \}\
\}}