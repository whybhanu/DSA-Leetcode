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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return head.next;
        }
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        if(size == 2){
            head.next = null;
            return head;
        }
        int mid = size / 2;
        int i = 0;
        currNode = head;
        while(i < mid){
            i++;
            if(i != mid){
                currNode = currNode.next;
            }
        }
        currNode.next = currNode.next.next;
        return head;
    }
}