/*
Problem-->

  Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number.

  https://www.geeksforgeeks.org/problems/square-root/1?page=3&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    int floorSqrt(int n) {
        // code here
       double root=Math.sqrt(n);
       return (int)Math.floor(root);
   }
}
