/*
Problem-->

Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false.

An array is said to be palindrome if its reverse array matches the original array.

https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=7&category=Arrays&status=unsolved&sortBy=submissions

Ans-->
  */


class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
         int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All elements matched
    }
}
