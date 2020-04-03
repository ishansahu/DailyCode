/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    public Node flatten(Node head) {
        helper(head);
        return head;
    }
    
    public Node helper(Node head){
        Node pre = head, curr = head;
        while(curr !=null){
            if(curr.child == null){
                pre = curr;
                curr = curr.next;
            }else{
                Node temp = curr.next;
                Node child = helper(curr.child);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                if(temp != null) temp.prev = child;
                child.next = temp;
                pre = child;
                curr = temp;
            }
        }
        return pre;
    }
}