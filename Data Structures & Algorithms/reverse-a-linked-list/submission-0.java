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
    public ListNode reverseList(ListNode head)
     {
         Node prev=null;
         Node curr=head;
         Node next=null;
         while(curr!=null)
         {
            next=curr.next;
            curr.next=prevv;
            prev=curr;
            curr=next;
         }
         return head;
    }
}
