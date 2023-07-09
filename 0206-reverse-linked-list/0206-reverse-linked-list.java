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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nexts = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexts;
        }
        return prev;
    }
}

































        // ListNode prevNode = null;
        // ListNode currNode = head;
        // while(currNode != null){
        //     ListNode temp = currNode.next;
        //     currNode.next = prevNode;
        //     prevNode = currNode;
        //     currNode = temp;
        // }
        // return prevNode;