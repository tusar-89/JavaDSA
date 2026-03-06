Problem-->

A function F is defined as follows F(n)= (1) +(2*3) + (4*5*6) ... upto n terms (look at the examples for better clarity). Given an integer n, determine the F(n).

Note: As the answer can be very large, return the answer modulo 109+7.

https://www.geeksforgeeks.org/problems/recursive-sequence1611/1?page=1&category=Recursion&difficulty=Easy&sortBy=submissions 

Solution-->

class Solution {
    static long sequence(int n) {
        long mod = 1000000007;
        long num = 1;
        long sum = 0;

        for(int i = 1; i <= n; i++){
            long termProduct = 1;

            for(int j = 0; j < i; j++){
                termProduct = (termProduct * num) % mod;
                num++;
            }

            sum = (sum + termProduct) % mod;
        }

        return sum;
    }
}
