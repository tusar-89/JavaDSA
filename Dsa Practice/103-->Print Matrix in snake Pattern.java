/*
Problem-->

  Given a matrix mat[][] of size n x n. Print the elements of the matrix in the snake like pattern depicted below

  Examples :

Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
Output: [45, 48, 54, 87, 89, 21, 70, 78, 15] 
Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15] 

  https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/print-matrix-in-snake-pattern-1587115621

Ans-->

  */

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
           if(i%2==0) //even index row
           {  
               //left to right in arry 
               for(int j=0;j<n;j++)
               {
                   ans.add(matrix[i][j]);
               }
           }
           else//odd index row 
           {
               //right to left in array 
               for(int j=n-1;j>=0;j--)
               {
                   ans.add(matrix[i][j]);
               }
           }
        }
        return ans;
    }
}

