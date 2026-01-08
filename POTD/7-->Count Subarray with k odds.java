/*

Problem-->

You are given an array arr[] of positive integers and an integer k. You have to count the number of subarrays that contain exactly k odd numbers.

https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1

Ans-->

  */
import java.util.*;

class Solution {
    public int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // Base case: 0 odd numbers before starting

        int countOdd = 0;
        int result = 0;

        for (int num : arr) {
            // Increment count if current number is odd
            if (num % 2 != 0) {
                countOdd++;
            }

            // If there exists a prefix with (countOdd - k) odds,
            // that means there are subarrays with exactly k odds ending here
            if (freq.containsKey(countOdd - k)) {
                result += freq.get(countOdd - k);
            }

            // Update frequency of current odd count
            freq.put(countOdd, freq.getOrDefault(countOdd, 0) + 1);
        }

        return result;
    }
}

