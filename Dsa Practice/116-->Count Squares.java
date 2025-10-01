/*
  
Problem-->

Given a positive integer n, find the number of perfect squares that are less than n in the sample space of perfect squares.
The sample space consists of all perfect squares starting from 1 (i.e., 1, 4, 9, 16, 25, …).

https://www.geeksforgeeks.org/problems/count-squares3649/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

*/


class Solution {
    static int countSquares(int n) {
        // code here
         return (int)Math.sqrt(n - 1);
    }
}
