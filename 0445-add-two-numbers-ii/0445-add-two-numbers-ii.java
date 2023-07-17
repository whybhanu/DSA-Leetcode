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
        ListNode newL1 = reverse(l1);
        ListNode newL2 = reverse(l2);
        ListNode finalNode = add(newL1, newL2);
        return reverse(finalNode);
    }
    ListNode add(ListNode root1, ListNode root2){
        int carry = 0;
        ListNode curr1 = root1;
        ListNode curr2 = root2;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(curr1 != null || curr2 != null){
            int ans = carry;
            if(curr1 != null){
                ans = ans + curr1.val;
                curr1 = curr1.next;
            }
            if(curr2 != null){
                ans = ans + curr2.val;
                curr2 = curr2.next;
            }
            carry = ans/10;
            ans %= 10;
            curr.next = new ListNode(ans);
            curr = curr.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return res.next;
    }

    ListNode reverse(ListNode root){
        ListNode curr = root;
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