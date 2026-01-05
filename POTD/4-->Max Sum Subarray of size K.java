/*
  
Problem-->

Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

Ans-->

  */

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1; // invalid case: subarray of size k not possible

        int maxSum = 0, windowSum = 0;

        // Step 1: Compute sum of first 'k' elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add next element, remove previous
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return the maximum sum found
        return maxSum;
    }
}
