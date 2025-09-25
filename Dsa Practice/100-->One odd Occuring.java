/*
Problem-->

  Given an array of arr[] positive integers where all numbers occur even number of times except one number
  which occurs odd number of times. Return that number.

  https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans--> 

  */

class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR each number
        }
        return result;
    
    }
}

