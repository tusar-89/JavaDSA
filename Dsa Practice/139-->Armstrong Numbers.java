/*  

Problm-->

You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1?page=10&sortBy=submissions

Ans-->

  */

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;       // extract last digit
            sum += digit * digit * digit; // cube and add
            n /= 10;                  // remove last digit
        }

        return sum == original;
    }
}
