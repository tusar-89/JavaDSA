/*

Problem-->

Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order.
Given an array arr[], with starting index low and ending index high, complete the functions partition() and quickSort().
Use the last element as the pivot, so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.

https://www.geeksforgeeks.org/problems/quick-sort/1?page=1&category=Sorting&sortBy=submissions

Ans-->

  */

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find partition index
            int pi = partition(arr, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as pivot
        int i = low - 1;        // Index of smaller element
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1; // Return partition index
    }
}
