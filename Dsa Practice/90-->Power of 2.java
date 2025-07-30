/*
Problem-->

  Given a non-negative integer n. You have to check if it is a power of 2 or not. 

  https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1?page=2&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
         if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
