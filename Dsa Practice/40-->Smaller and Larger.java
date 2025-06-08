/*
Problem-->
  
Given a sorted array arr and a value target, return an array of size 2.
The first value is the number of elements less than or equal to the target,
and the second value is the number of elements greater than or equal to the target.

 https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
Ans-->
*/
class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int small=0;
        int great=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                small++;
            }
            if(arr[i]>=target)
            {
                great++;
            }
        }
        return new int []{small,great};
    }
}
