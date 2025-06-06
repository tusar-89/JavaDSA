/*
Problem-->

You have given two sorted arrays arr1[] & arr2[] of distinct elements.
The first array has one element extra added in between. Return the index of the extra element.

Note: 0-based indexing is followed.

https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
Ans-->
*/

class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int r=0;
        for(int i=0;i<b.length;i++)
        {
           if(b[i]!=a[i]) 
           {
               return i;
           }
        }
        return a.length-1;
    }
}
