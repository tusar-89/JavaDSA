/*
Problem-->

  Given an array arr of positive integers. The task is to swap every ith element of the array with (i+2)th element.

https://www.geeksforgeeks.org/problems/need-some-change/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    public void swapElements(int[] arr) {
        // Code here
         
          int n = arr.length;
        for (int i = 0; i + 2 < n; i++) {
            // Swap arr[i] and arr[i+2]
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
}
