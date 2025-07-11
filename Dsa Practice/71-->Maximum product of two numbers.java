/*
Problem-->

Given an array arr of non-negative integers, return the maximum product of two numbers possible.

https://www.geeksforgeeks.org/problems/maximum-product-of-two-numbers2730/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>first)
            {
                sec=first;
                first=num;
            }
            else if(num>sec)
            {
                sec=num;
            }
        }
        return sec*first;
    }
}
