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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        if(size < 4){
            return head.next;
        }

        // if elements are greater than 4 or equal to 4
        int mid = size/2 + 1;
        int i = 1;
        ListNode prevNode = head;
        while(i < mid){
            head = head.next;
            i++;
        }
        return head;
    }
}