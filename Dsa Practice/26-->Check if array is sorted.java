Problem-->

Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
    
Ans-->

    class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
            return false;
            }
        }
        return true;
    }
}
