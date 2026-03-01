Problem-->

You are given an integer n, return the fibonacci series till the nth(0-based indexing) term. Since the terms can become very large return the terms modulo 109+7.

  https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1?page=1&category=Recursion&difficulty=Easy&sortBy=submissions
  
Solution-->

class Solution {

    int[] Series(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        if (n == 1) {
            return new int[]{0, 1};
        }
        int mod = 1000000007;//Its given to add on it 
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % mod;
        }

        return fib;
    }
}
