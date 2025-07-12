/*
problem-->

Given a positive integer x and an array arr of positive integers.
We need to find the farthest index at which x is present. If any occurrence of x doesn't exist, then return -1.

https://www.geeksforgeeks.org/problems/longest-equal-prefix3139/1?page=4&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public int findIndex(int[] arr, int x) {
        // code
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
               return i+1; 
            }
            
        }
        return -1;
    }
}
