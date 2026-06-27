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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newPoint = new ListNode(0);
        ListNode alt = newPoint;
        while(head!=null){
            if(head.val!=val){
                alt.next=head;
                alt=alt.next;
            }
            head=head.next;
        }
        alt.next=null;
        return newPoint.next;
    }
}