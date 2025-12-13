/*
Problem-->
 
You are given an array arr of numbers. Return the sum of all the elements except the first and last elements.

https://www.geeksforgeeks.org/problems/max-length-chain/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

*/
class Solution {
    int sumExceptFirstLast(int[] arr) {
        // your code here
         if (arr.length <= 2) {
            return 0;
        }
        
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
