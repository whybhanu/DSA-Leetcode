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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        // from the first
        int x = -1;
        ListNode firstNode = head;
        int i = 1;
        while(i < k){
            firstNode = firstNode.next;
            i++;
        }

         // from the last
        int y = -1;
        ListNode secondNode = head;
        i = 1;
        while(i <= size - k){
            secondNode = secondNode.next;
            i++;
        }

        // simple swapping of two numbers
        int temp = secondNode.val;
        secondNode.val = firstNode.val;
        firstNode.val = temp;
        
        return head;
    }
}