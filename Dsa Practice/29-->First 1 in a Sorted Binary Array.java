Problem-->

Given a sorted array arr consisting of 0s and 1s. The task is to find the index (0-based indexing) of the first 1 in the given array.

NOTE: If one is not present then, return -1.

https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1?page=5&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                return i;
            }
        }
        return -1;
    }
}
