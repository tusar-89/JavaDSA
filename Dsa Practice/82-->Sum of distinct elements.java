/*
Problem-->

You are given an array arr. Find the sum of distinct elements in an array.

https://www.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1?page=2&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    int findSum(int arr[]) {
        Arrays.sort(arr);  // Step 1: Sort the array

        int sum = arr[0];  // Add the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {  // Step 2: Skip duplicates
                sum += arr[i];
            }
        }

        return sum;
    }
}
