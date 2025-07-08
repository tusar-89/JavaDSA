/*
Prolem-->

Given an array A[] of N positive integers and two positive integers K1 and K2.
Find the sum of all elements between K1th and K2th smallest elements of the array.
It may be assumed that (1 <= k1 < k2 <= n).

https://www.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
  
Ans-->
  
*/

class Solution {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        // Your code goes here
        Arrays.sort(A);  // Step 1: Sort the array

        long sum = 0;
        // Step 2: Sum elements between K1-th and K2-th (1-based index)
        for (int i = (int)K1; i < (int)K2 - 1; i++) {
            sum += A[i];
        }
        return sum;
    }
}
