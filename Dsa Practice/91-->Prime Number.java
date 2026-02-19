Problem-->

Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

https://www.geeksforgeeks.org/problems/prime-number2314/1?page=2&status=unsolved&sortBy=submissions

Ans-->Brute Force Approach

class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n <= 1) return false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
Optimal Approach-->

 class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n <= 1) return false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
