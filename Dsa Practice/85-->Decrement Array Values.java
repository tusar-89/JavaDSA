/*
Problem-->

You are given an array arr[] that contains integers.
You need to decrement each element of the array by 1 and return the array.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/decrement-array-values

Ans-->

*/
class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]--;
        }
        return arr;
    }
}
