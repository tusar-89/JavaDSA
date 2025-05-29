Problem-->

  Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X,
  the task is to count the number of elements which are strictly smaller than X.
  The given integer may or not be present in the array given.

 https://www.geeksforgeeks.org/problems/count-smaller-than-x/1?page=10&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
Ans-->

  class Solution {
    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
        int count=0;
        for(int ele:arr)
        {
            if(ele<x)
            {
                count++;
            }
        }
        return count;
    }
}
