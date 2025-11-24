/*
  
Problem--> 

Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

https://www.geeksforgeeks.org/problems/insertion-sort/1?page=1&category=Sorting&sortBy=submissions

Ans-->

*/

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
