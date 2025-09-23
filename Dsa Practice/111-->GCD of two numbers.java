/*
Problem-->
  
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public static int gcd(int a, int b) {
        // code here
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
