/*
Problem-->

  Given three integers  'a' denotes the first term of an arithmetic sequence, 'c' denotes the common difference of an arithmetic sequence and an integer 'b'.
  you need to tell whether 'b' exists in the arithmetic sequence or not.
  Return 1 if b is present in the sequence. Otherwise, returns 0.

  https://www.geeksforgeeks.org/problems/arithmetic-number2815/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

Ans-->

  */

// User function Template for Java

class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
         if (c == 0) {
            return (a == b) ? 1 : 0;
        }

        // Check if b is in the sequence
        if ((b - a) % c == 0 && (b - a) / c >= 0) {
            return 1;
        } else {
            return 0;
        }
    }
} 
