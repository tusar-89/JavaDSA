/*

Problem-->

  Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

  https://www.geeksforgeeks.org/problems/perfect-numbers3207/1?page=2&difficulty=Easy&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    static boolean isPerfect(int n) {
        // code here
          if (n <= 1)
            return false;  // 1 is not a perfect number

        int sum = 1; // 1 is always a divisor

        // loop till square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i; // add the divisor
                
                // add the pair divisor if it's not the same
                if (i != n / i)
                    sum += n / i;
            }
        }
        return sum==n;
    }
};

