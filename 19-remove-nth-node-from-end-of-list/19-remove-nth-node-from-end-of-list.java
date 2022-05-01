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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
        
        ListNode l3= new ListNode(-1);
        l3.next=head;
        ListNode fast=l3,slow=l3;
        
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        
        while(fast.next!=null)
        {

                fast=fast.next;
                slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return l3.next;
}
}
//size=2
//n=1

//
// n=1;
// size=5
// 4= 5-1
    
// n=2
// size=5
// 3=5-2