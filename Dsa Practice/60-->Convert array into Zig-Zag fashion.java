/*
Problem-->

Given an array arr of distinct elements, the task is to rearrange the elements of the array in a zig-zag fashion so that 
the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

Note: Modify the given arr[] only, If your transformation is correct, the output will be "true" else the output will be "false".

  https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&category=Arrays&difficulty=Easy&status=solved&sortBy=submissions

  Ans-->

*/

class Solution {
    public static void zigZag(int[] arr) {
        // code here
         int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                // Even index: arr[i] < arr[i + 1]
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                // Odd index: arr[i] > arr[i + 1]
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
