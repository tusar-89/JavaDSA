/*
Problem-->

  Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.

  https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?page=2&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int element:arr)
        {
            if(element==k)
            {
                return true;
            }
        }
        return false;
    }
}

