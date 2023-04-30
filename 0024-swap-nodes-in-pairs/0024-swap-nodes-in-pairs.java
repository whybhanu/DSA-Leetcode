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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode currNode = head;
        int size = 0;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }

        int i = 1;
        ListNode firstNode = head;
        ListNode secondNode = firstNode.next;
        while(i <= size/2){
            swap(firstNode, secondNode);
            firstNode = secondNode.next;
            if(firstNode != null){
                secondNode = firstNode.next;
            }
            i++;
        }
        return head;
    }

    public void swap(ListNode firstNode, ListNode secondNode){
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }
}

