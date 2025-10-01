/*

Problem-->

  Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

  https://www.geeksforgeeks.org/problems/max-min/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

// User function Template for Java

class Solution {
    public static int findSum(int A[], int N) {
        // code here
         int max=A[0];
         int min=A[0];
         int ans=0;
        for(int i=0;i<N;i++)
        {
            max=Integer.max(max,A[i]);
            min=Integer.min(min,A[i]);
        }
        ans=max+min;
        return ans;
    }
}
