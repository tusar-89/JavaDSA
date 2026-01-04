/*
  
Problem-->
  
Given a linked list containing n head nodes where every node in the linked list contains two pointers:
(i) next points to the next node in the list.
(ii) bottom points to a sub-linked list where the current node is the head.
Each of the sub-linked lists nodes and the head nodes are sorted in ascending order based on their data.
Flatten the linked list such that all the nodes appear in a single level while maintaining the sorted order.

https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1

Ans-->

*/

/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/

class Solution {
    
    // Function to merge two sorted linked lists (using bottom pointers)
    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        
        Node result;
        
        // Compare nodes by data
        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }
        
        result.next = null; // next pointer should not be used in flattened list
        return result;
    }
    
    // Main function to flatten the linked list
    public Node flatten(Node root) {
        // Base case: if list is empty or has only one head node
        if (root == null || root.next == null)
            return root;
        
        // Recursively flatten the rest of the list
        root.next = flatten(root.next);
        
        // Merge current list with the right (flattened) list
        root = merge(root, root.next);
        
        return root;
    }
}
