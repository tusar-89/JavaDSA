/*
  
Problem-->

Given an array of integers arr[]  and a number k. Return the maximum xor of a subarray of size k.

https://www.geeksforgeeks.org/problems/max-xor-subarray-of-size-k/1

Ans-->

  */
class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1; // not enough elements for a window of size k

        int maxXor = 0;
        int windowXor = 0;

        // Step 1: Compute XOR of the first window
        for (int i = 0; i < k; i++) {
            windowXor ^= arr[i];
        }

        maxXor = windowXor;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            // Remove the leftmost element (arr[i - k]) and add the new element (arr[i])
            windowXor ^= arr[i - k]; 
            windowXor ^= arr[i];

            // Update max XOR
            maxXor = Math.max(maxXor, windowXor);
        }

        // Step 3: Return the maximum XOR found
        return maxXor;
    }
}
