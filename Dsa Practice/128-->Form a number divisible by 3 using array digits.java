/* 

Problem-->

You will be given an array arr of integers of length N. You can construct an integer from two integers by treating the integers as strings, and then concatenating them.
For example, 19 and 4 can be used to construct 194 and 419.

The task is to find whether it’s possible to construct an integer using all the digits of these numbers such that it would be divisible by 3.
If it is possible then print 1 and if not print 0.

https://www.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1?page=2&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

Ans-->

  */

// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
         int sum = 0;

        for (int num : arr) {
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;  // add each digit
                temp /= 10;
            }
        }

        // Check divisibility by 3
        return (sum % 3 == 0) ? 1 : 0;
    }
}
