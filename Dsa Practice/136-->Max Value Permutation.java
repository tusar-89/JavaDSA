/*

Problem-->

Given an array, arr of integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n-1. 
You are allowed to rearrange the elements of the array.
Note: Since the output could be large, print the answer modulo 109+7.

https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1?page=4&status=unsolved&sortBy=submissions

Ans-->

*/

// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int MOD = 1000000007;

        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: Compute sum(arr[i] * i) % MOD
        long sum = 0; // use long to avoid integer overflow

        for (int i = 0; i < arr.length; i++) {
            sum = (sum + ((long) arr[i] * i) % MOD) % MOD;
        }

        // Step 3: Return result as int (mod 1e9+7)
        return (int) sum;
    }
}
