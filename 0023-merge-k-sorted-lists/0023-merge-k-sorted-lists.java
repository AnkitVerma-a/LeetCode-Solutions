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
    public ListNode merge(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(-1);
       ListNode temp = dummy;
       while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
       }
       while(list1!=null){
        temp.next=list1;
        list1=list1.next;
        temp=temp.next;
       }
       while(list2!=null){
        temp.next=list2;
        list2=list2.next;
        temp=temp.next;
       }
       return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        int diff=1;
        while(diff<lists.length){
            for(int i=0;i+diff<lists.length;i+=diff*2){
                lists[i]=merge(lists[i],lists[i+diff]);
            }
            diff*=2;
        }
        return lists[0];
    }
}