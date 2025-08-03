/*
Problem-->

Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

  Ans-->

  */

class Solution {
    int sumOfSeries(int n) {
        // code here
         int sum = n * (n + 1) / 2;
        return sum * sum;
    }
}
