/*
Problem-->

Given a 2-D integer matrix mat[][] of size n*m. Return a list of integers where list[i] represents
the sum of elements of the ith row of the matrix.

Note: The sum of any row will remain within th

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/row-sum-in-a-matrix

Ans-->
*/

class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        
     int n = mat.length;         // number of rows
        int[] result = new int[n];  // array to store row sums

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            result[i] = sum;
        }

        return result;
    }
}
