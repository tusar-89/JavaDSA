/* 
Problem-->

Given a n*n matrix mat[][] ,check whether the matrix is a magic square or not.

A Magic Square is a n x n matrix of distinct elements from 1 to n2 where the sum of any row, column, or diagonal is always equal to the same number.

  Examples:

Input: mat = [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
Output: "Magic Square"
Explanation: R1->2+7+6=15, R2->9+5+1=15, R3->4+3+8=15
             C1->2+9+4=15, C2->7+5+3=15, C3->6+1+8=15
             D1->2+5+8=15, D2=6+5+4=15

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/magic-square

Ans-->

  */

class Solution {
    public static String magicSquare(int mat[][]) {
        // Code here
        int n=mat.length;
        int total =n*n;
        int target=0;
        int digo1=0;
        int digo2=0;
        boolean []seen=new boolean[total+1];
        // Check For Duplicate
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int val=mat[i][j];
                if(val<1||val>total||seen[val])
                {
                    return "Not a Magic Square";
                }
                seen[val]=true;
            }
        }
        //Sum Of First Row
        for(int i=0;i<n;i++)
        {
            target+=mat[0][i];
        }
        //Row Sum
        for(int i=0;i<n;i++)
        {
            int rowsum=0;
            for(int j=0;j<n;j++)
            {
                rowsum+=mat[i][j];
            }
            if(rowsum!=target) return "Not a Magic Square";
        }
        //Column Sum
        for(int i=0;i<n;i++)
        {
            int colsum=0;
            for(int j=0;j<n;j++)
            {
                colsum+=mat[j][i];
            }
            if(colsum!=target) return "Not a Magic Square";
        }
        //Digonal Sum
        for(int i=0;i<n;i++)
        {
           digo1+=mat[i][i];
        
            digo2+=mat[i][n-i-1];
        }
        if(digo1!=target||digo2!=target) 
        {
            return "Not a Magic Square";
            
        }
        return "Magic Square";
    }
}
