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
        ListNode result=new ListNode(0,head);
        ListNode temp=head;
        ListNode temp2=result;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        while(temp!=null){
            temp=temp.next;
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return result.next;
    }
}
