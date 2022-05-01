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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        if(l1==null&&l2==null)
            return null;
        
        if(l1==null&&l2!=null)
            return l2;
        if(l1!=null && l2==null)
            return l1;
        
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode l3=new ListNode(0);
        ListNode h3=l3;
        int carry=0;
        
        
        while(h1!=null && h2!=null)
        {
            int sum= h1.val +h2.val +carry;
            
            carry=sum/10;
            sum=sum%10;
            
            h3.next=new ListNode(sum);
            
            h1=h1.next;
            h2=h2.next;
            h3=h3.next;
        }
        
        while(h1!=null)
        {
          int sum= carry+ h1.val;
           
                carry=sum/10;
                sum=sum%10;
           
            h3.next=new ListNode(sum);
            h1=h1.next;
            h3=h3.next;

            
        }
        while(h2!=null)
        {
            int sum= carry+ h2.val;
            
                carry=sum/10;
                sum=sum%10;
            
            h3.next=new ListNode(sum);
            h2=h2.next;
            h3=h3.next;
        }
        
        if(carry!=0)
        {  h3.next=new ListNode(carry);
           //h3=h3.next;
        }
        l3=l3.next;
        return l3;
    }
}