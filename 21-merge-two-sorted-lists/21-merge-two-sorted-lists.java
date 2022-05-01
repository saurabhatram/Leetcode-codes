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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        if(l1==null&&l2==null)
            return null;
        
             
        if(l1!=null&&l2==null)
            return l1;
             
        if(l1==null&&l2!=null)
            return l2;
        
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode l3=new ListNode(-1);
        ListNode h3=l3;
        while(h1!=null&&h2!=null)
        {
            if(h1.val>h2.val)
            {
                h3.next=new ListNode(h2.val);
                h3=h3.next;
                h2=h2.next;
            }
            else
            {
                h3.next=new ListNode(h1.val);
                h3=h3.next;
                h1=h1.next;
            }
        }
        
        while(h1!=null)
        {
            h3.next=new ListNode(h1.val);
            h3=h3.next;
             h1=h1.next;
        }
        
         while(h2!=null)
        {
            h3.next=new ListNode(h2.val);
            h3=h3.next;
            h2=h2.next;
        }
        
        return l3.next;
    }
}