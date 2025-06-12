/*
Problem-->

Insertion is a basic but frequently used operation. Arrays in most languages can not be dynamically shrinked or expanded.
Here, we will work with such arrays and try to insert an element at the end of the array.

You need to modify the given array arr. The size of the array is given by sizeOfArray. 
You need to insert an element at the end. Array already have the sizeofarray -1 elements. 

https://www.geeksforgeeks.org/problems/array-insert-at-end/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
*/

class Insert {
    // You only need to insert the given element at
    // the end, i.e., at index sizeOfArray - 1. You may
    // assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtEnd(int arr[], int sizeOfArray, int element) {
        // Your code here
         arr[sizeOfArray - 1] = element;
    }
}
