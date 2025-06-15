/*
problem-->

Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

  https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        
              int n = arr.length;

        // Create temp arrays for positive and negative elements
        int[] temp = new int[n];
        int index = 0;

        // First copy all positive elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Then copy all negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy the result back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        
    }
}
