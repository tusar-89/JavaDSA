/*
Problem-->

You are given an array A of size N. Let us denote S as the sum of all integers present in the array.
Among all integers present in the array, find the minimum integer X such that S ≤ N*X.

https://www.geeksforgeeks.org/problems/minimum-integer--170647/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  */
class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
         long sum = 0;
        for (int num : A) {
            sum += num;
        }

        int result = Integer.MAX_VALUE;

        for (int num : A) {
            if ((long) N * num >= sum) {
                result = Math.min(result, num);
            }
        }

        return result;
    }
}
