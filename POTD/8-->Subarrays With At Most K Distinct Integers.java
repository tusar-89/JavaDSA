/*

Problem-->

You are given an array arr[] of positive integers and an integer k, find the number of subarrays in arr[] where the count of distinct integers is at most k.

https://www.geeksforgeeks.org/problems/subarrays-with-at-most-k-distinct-integers/1

Ans-->

  */

  import java.util.*;

class Solution {
    public int countAtMostK(int arr[], int k) {
        int n = arr.length;
        int left = 0;
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            // Add current element to window
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            // If distinct elements exceed k, shrink window from the left
            while (freq.size() > k) {
                freq.put(arr[left], freq.get(arr[left]) - 1);
                if (freq.get(arr[left]) == 0) {
                    freq.remove(arr[left]);
                }
                left++;
            }

            // Number of valid subarrays ending at index 'right'
            count += (right - left + 1);
        }

        return count;
    }
}
