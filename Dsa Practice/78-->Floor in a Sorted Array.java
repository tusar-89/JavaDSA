/*
problem-->

 Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x.
  This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence. 

  https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?page=2&sortBy=submissions

  Ans-->

  */

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<=x)
            {
                return i;
                
            }
        }
        return -1;
    }
}
