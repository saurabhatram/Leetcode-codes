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
    static ListNode nhead;
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        
        ListNode ohead=helper(head);
        ohead.next=null;
        return nhead;
    }
    
        public ListNode helper(ListNode head) {
        
            if(head==null)
                return null;
            
            helper(head.next);
            
            if(head.next!=null)
                head.next.next=head;
            else
                nhead=head;
                
            return head;
    }
}