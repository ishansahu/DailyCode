{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww28600\viewh14680\viewkind0
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
    public boolean isPalindrome(ListNode head) \{\
        ListNode fast = head;\
        ListNode slow = head;\
        while(fast != null && fast.next != null)\{\
            fast = fast.next.next;\
            slow = slow.next;\
        \}\
        if(fast != null)\{\
            slow = slow.next;\
        \}\
        slow = reverse(slow);\
        fast = head;\
        while(slow != null)\{\
            if(fast.val != slow.val)  return false;\
            slow = slow.next;\
            fast = fast.next;\
        \}\
        return slow == null;\
    \}\
    \
    public ListNode reverse(ListNode head)\{\
        ListNode prev = null;\
        while (head != null)\{\
            ListNode next = head.next;\
            head.next = prev;\
            prev = head;\
            head = next;\
            \
        \}\
        return prev;\
    \}\
\}}