/*
Problem-->
  
Given a 2D binary matrix(1-based indexed) mat of dimensions nxm , determine the row that contains the minimum number of 1's.
Note: The matrix contains only 1's and 0's. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/row-with-minimum-number-of-1s5430

Ans-->
  */

class Solution {
    int minRow(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        int row=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            if(count<ans)
            {
                ans=count;
                row=i+1;
                
            }
        }
        return row;
    }
};
