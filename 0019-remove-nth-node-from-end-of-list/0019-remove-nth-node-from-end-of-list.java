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
        if(head==null)return head;
        if(head.next==null)return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(n==cnt){
            head=head.next;
            return head;
        }
        int rm=cnt-n+1;
        temp=head;
        cnt=1;
        while(cnt<(rm-1)){
            cnt++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}