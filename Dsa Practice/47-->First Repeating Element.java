/*
Problem-->

  Given an array arr[], find the first repeating element.
  The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 

https://www.geeksforgeeks.org/problems/first-repeating-element4018/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */
class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int n = arr.length;

        // Assuming the range of values is within 0 to 10^6
        int[] count = new int[1000001];

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Find the first repeating element
        for (int i = 0; i < n; i++) {
            if (count[arr[i]] > 1) {
                return i + 1; // Return 1-based index
            }
        }

        return -1; // No repeating element found
    }
}
