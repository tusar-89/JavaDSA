/*
Problem-->
  
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it.
Return -1 if no such point exists. 

https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&status=unsolved&sortBy=submissions

Ans-->

  */
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
