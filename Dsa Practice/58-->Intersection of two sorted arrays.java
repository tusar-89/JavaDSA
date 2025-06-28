/*
Problem-->

Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays.

Intersection of two arrays is said to be elements that are common in both arrays. 
The intersection should not count duplicate elements.

Note: If there is no intersection then return an empty array.

  https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // add your code here
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates in arr1
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) i++;
            // Skip duplicates in arr2
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) j++;

            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    // Elements match
                    result.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        return result;
    }
}
