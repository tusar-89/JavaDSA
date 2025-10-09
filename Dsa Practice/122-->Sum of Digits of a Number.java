/*

Problem-->

  You are given a number n. You need to find the sum of digits of n.

  https://www.geeksforgeeks.org/problems/sum-of-digits-of-a-number/1?page=2&difficulty=Basic&status=unsolved&sortBy=submissions

  Ans-->

  */

class Solution {
    public static int sumOfDigits(int n) {
        // Code here
         int sum = 0;
        
        while (n > 0) {
            sum += n % 10; // add last digit
            n /= 10;       // remove last digit
        }
        
        return sum;
    }
}
