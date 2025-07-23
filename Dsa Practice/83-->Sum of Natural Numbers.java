/*
Problem-->
Given an integer n, your task is to compute the sum of all natural numbers from 1 to n (inclusive).
If n is 0, the sum should be 0.
  
https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public static int findSum(int n) {
        // code here
        int sum=0;
       
        
          sum=(n*(n+1))/2;
        
         return sum;
    }
}
