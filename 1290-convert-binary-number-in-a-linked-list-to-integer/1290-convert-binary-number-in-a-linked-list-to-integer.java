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
    public int getDecimalValue(ListNode head) {
        String s = "";
        ListNode currNode = head;
        while(currNode != null){
            s = s + currNode.val;
            currNode = currNode.next;
        }
        Integer i = Integer.parseInt(s, 2);
        return (int)(i);
    }
}