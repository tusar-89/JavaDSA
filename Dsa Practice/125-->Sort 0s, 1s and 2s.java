/*
(-- Dutch National Flag Algorithm--)or DNF Algorithm
Problem-->

  Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

  https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&status=unsolved&sortBy=submissions

  Ans-->

  */

class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low++]=arr[mid];
                arr[mid++]=temp;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
    }
}
