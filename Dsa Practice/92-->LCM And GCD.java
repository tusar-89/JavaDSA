/*
Problem-->

Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // GCD using Euclidean Algorithm
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;

        // LCM using formula
        int lcm = (a * b) / gcd;

        // Return as array
        return new int[]{lcm, gcd};
    }
}
