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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = new ListNode(0);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result = l3;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.val;
                temp2 = temp2.next;
            }

            // carry of two nums
            carry = sum/10;
            sum = sum % 10;
            result.next = new ListNode(sum);
            result = result.next;
        }
        if(carry == 1) result.next = new ListNode(1);
        return l3.next;
    }
}