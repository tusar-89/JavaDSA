/*
Problem-->

Given a number n find the prime factorization of the number.
Note: Print the prime factors in non-decreasing order.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Functions-2/problem/prime-factorization

Ans-->
  */

class Solution {
    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeFactorization(int n) {

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }
}
