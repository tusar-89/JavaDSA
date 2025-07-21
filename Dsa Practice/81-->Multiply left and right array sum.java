/*
Problem-->

You are given an array of integers, your task is to divide the array into two sub-arrays
  (left and right) containing half of the array elements. 
  Find the sum of the subarrays and then return the multiply of both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.

https://www.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
*/

class Solution {
    public int multiply(int[] arr) {
        // code here
          int n = arr.length;
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        // Sum of left half
        for (int i = 0; i < mid; i++) {
            leftSum += arr[i];
        }

        // Sum of right half
        for (int i = mid; i < n; i++) {
            rightSum += arr[i];
        }

        return leftSum * rightSum;
    
    }
}
