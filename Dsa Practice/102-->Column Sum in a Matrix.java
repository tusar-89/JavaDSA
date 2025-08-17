/*
Problem-->

  Given a 2-D integer matrix mat[][] of size n*m.
  Return a list of integers where list[i] represents the sum of elements of the ith column of the matrix.

  https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/column-sum-in-a-matrix

  Ans-->
  */

class Solution {
    public static int[] colSum(int mat[][]) {
  
        int n = mat.length;        // number of rows
        int m = mat[0].length;     // number of columns
        int[] res = new int[m];    // result array

        for (int i = 0; i < n; i++) {
            for (int j= 0; j < m; j++) {
                res[j] += mat[i][j];
            }
        }

        return res;
    }
}    
