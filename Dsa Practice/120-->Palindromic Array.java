/*

Problem-->

  Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

  https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    // Helper method to check if a number is palindrome
    private static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev == original;
    }

    // Main function to check if all elements are palindrome
    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false; // found a non-palindrome
            }
        }
        return true; // all palindromes
    }
}
