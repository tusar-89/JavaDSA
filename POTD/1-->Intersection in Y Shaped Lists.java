/*
Problem 

You are given the heads of two non-empty singly linked lists, head1 and head2, that intersect at a certain point. Return that Node where these two linked lists intersect.

Note: It is guaranteed that the intersected node always exists.

In the custom input you have to give input for CommonList which pointed at the end of both head1 and head2 to form a Y-shaped linked list.

https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
  
Ans-->

*/

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node a = head1;
        Node b = head2;
        
        while (a != b) {
            // When a pointer reaches the end, redirect it to the head of the other list
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }
        
        // Either intersection node or null
        return a;
    }
}
