/*
Problem-->
Given an array arr[] of positive integers where every element appears even times except for one.
Find that number occurring an odd number of times.

https://www.geeksforgeeks.org/problems/single-number1014/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
*/
class Solution {
    int getSingle(int arr[]) {
        // code here
         int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
