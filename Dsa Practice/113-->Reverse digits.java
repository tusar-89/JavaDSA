/*

Problem-->

You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes. 

https://www.geeksforgeeks.org/problems/reverse-digit0316/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

  Ans-->

  */

class Solution {
    public int reverseDigits(int n) {
        // Code here
             int rev = 0;
        while (n > 0) {
            int digit = n % 10;   // get last digit
            rev = rev * 10 + digit; // append digit
            n /= 10;              // remove last digit
        }
        return rev;
    }
}
