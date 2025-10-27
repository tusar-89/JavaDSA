/*  

Given an array arr[] of integers, calculate the median.

https://www.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public double findMedian(int[] arr) {
        // Code here.
         Arrays.sort(arr);  // Step 1: Sort the array
        int n = arr.length;
        
        // Step 2: Odd length → middle element
        if (n % 2 != 0) {
            return arr[n / 2];
        } 
        // Step 3: Even length → average of two middle elements
        else {
            return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }
    }
}
