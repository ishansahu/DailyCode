/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode fast = head, curr = head;
        ListNode start = new ListNode(-1);
        start.next = curr;
        int count =0;
        while(fast!=null){
            ++count;
            fast = fast.next;
        }
        int size = count/k;
        ListNode prev = start, s1=start;
        for(int i=0; i<size; ++i){
            int len=k;
            while(len>0){
                ListNode p1 = curr.next;
                curr.next = prev;
                prev = curr;
                curr = p1;
                --len;
            }
            ListNode tail = s1.next;
            tail.next = curr;
            s1.next = prev;
            s1 = tail;
        }
        
        return start.next;
    }
}