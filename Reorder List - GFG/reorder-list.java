//{ Driver Code Starts
import java.util.*;

import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[])throws IOException {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            int n = Integer.parseInt(in.readLine());
            ReorderList llist = new ReorderList();

            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(s[i]);
                llist.addToTheLast(new Node(a));
            }

            new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    void reorderlist(Node head) {
        Node curr = head;
        int size = findSize(curr);
        if(size <= 2) return;
        int i = 0;
        curr = head;
        while(i < size/2){
            curr = curr.next;
            i++;
        }
        Node halfPart = curr.next;
        curr.next = null;
        Node t2 = reverse(halfPart);
        Node t1 = head;
        boolean x = true;
        while(t1 != null && t2 != null){
            if(x){
                Node ft1 = t1.next;
                t1.next = t2;
                t1 = ft1;
            } else {
                Node ft2 = t2.next;
                t2.next = t1;
                t2 = ft2;
            }
            x = !x;
        }
    }
    
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }
    static int findSize(Node curr){
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }
}
