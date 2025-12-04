/*

Problem-->

  You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList.
  If k is more than the number of nodes, then the return -1.

  https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=3&sortBy=submissions

  Ans-->

    */

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from the end of a linked list.
    int getKthFromLast(Node head, int k) {
        if (head == null) return -1;

        Node fast = head;
        Node slow = head;

        // Step 1: Move the 'fast' pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null)  // If k is greater than the number of nodes
                return -1;
            fast = fast.next;
        }

        // Step 2: Move both pointers one step at a time
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Now 'slow' is at the kth node from the end
        return slow.data;
    }
}
