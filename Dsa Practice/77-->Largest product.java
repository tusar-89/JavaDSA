/*
Problem-->

Given an array arr and an integer k. You have to find the maximum product of k contiguous elements in the array. 

https://www.geeksforgeeks.org/problems/largest-product/1?page=3&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
*/
class Solution {
    public int findMaxProduct(int[] arr, int k) {
        // code here
    int n = arr.length;
        if (k > n) return 0;

        long maxProduct = Long.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            long product = 1;
            for (int j = i; j < i + k; j++) {
                product *= arr[j];
            }
            maxProduct = Math.max(maxProduct, product);
        }

        return (int) maxProduct;
    }
}
