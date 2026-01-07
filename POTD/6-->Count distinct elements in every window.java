/*

Problem-->

Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.

https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

Ans-->

*/
import java.util.*;

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        if (n < k) return result; // window cannot be formed

        // HashMap to store frequency of elements in current window
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Process the first window of size k
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        // Add count of distinct elements in first window
        result.add(freq.size());

        // Step 2: Slide the window from (k) to (n - 1)
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            int outgoing = arr[i - k];
            freq.put(outgoing, freq.get(outgoing) - 1);
            if (freq.get(outgoing) == 0) {
                freq.remove(outgoing);
            }

            // Add the new element entering the window
            int incoming = arr[i];
            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            // Add the count of distinct elements for this window
            result.add(freq.size());
        }

        return result;
    }
}
