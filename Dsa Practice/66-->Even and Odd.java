/*
Problem-->

Given an array arr[] of size N containing equal number of odd and even numbers. 
Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
Note: There are multiple possible solutions, Print any one of them. Also, 0-based indexing is considered.

 https://www.geeksforgeeks.org/problems/even-and-odd/1?page=7&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
*/

class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
         int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        // Copy the result back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
};
