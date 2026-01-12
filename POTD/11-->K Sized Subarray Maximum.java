/*

Problem-->

  Given an array arr[] of positive integers and an integer k.
  You have to find the maximum value for each contiguous subarray of size k. Return an array of maximum values corresponding to each contiguous subarray.

  https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

Ans-->

  */

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); // will store indexes of elements

        for (int i = 0; i < arr.length; i++) {
            // Step 1: Remove elements that are out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Step 2: Remove smaller elements (not useful) from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Step 3: Add current element’s index
            dq.offerLast(i);

            // Step 4: If window has reached size k, add the max (front of deque)
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}
