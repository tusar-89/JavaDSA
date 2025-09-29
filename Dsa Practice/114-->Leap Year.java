/*
Problem-->

You are given an Integer n. Return true if It is a Leap Year otherwise return false.

https://www.geeksforgeeks.org/problems/leap-year0943/1?page=2&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    static boolean isLeap(int N) {
        // code here
        if ((N % 400 == 0) || (N % 4 == 0 && N % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
