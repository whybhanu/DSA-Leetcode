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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode result = new ListNode(0);
        ListNode res = result;
        int sum = 0;
        while(curr != null){
            if(curr.val == 0){
                res.next = new ListNode(sum);
                sum = 0;
                res = res.next;
            }
            sum += curr.val;
            curr = curr.next;
        }
        return result.next;
    }
}