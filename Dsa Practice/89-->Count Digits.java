/*
Problem-->

Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). 
  Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

https://www.geeksforgeeks.org/problems/count-digits5716/1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10; // get the last digit
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10; // remove the last digit
        }

        return count;
    }
}
