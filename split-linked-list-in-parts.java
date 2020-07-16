/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode temp = root;
        int len =0;
        while(temp != null){
            ++len; 
            temp = temp.next;
        }
        ListNode[] res = new ListNode[k];
        int n = len/k, r= len%k;
        ListNode curr = root, prev = null;
        for(int i=0; curr!= null && i<k; ++i, --r){
            res[i] = curr;
            for(int j = 0; j<n + (r>0 ? 1:0); ++j){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        return res;
    }
}