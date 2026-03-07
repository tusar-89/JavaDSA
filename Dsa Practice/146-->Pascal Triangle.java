Problem-->

Given a positive integer n, return the nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

https://www.geeksforgeeks.org/problems/pascal-triangle0652/1?page=1&category=Recursion&sortBy=submissions

Ans-->

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        n--;
        ArrayList<Integer>ans=new ArrayList<>();
        int prev=1;
        ans.add(prev);
        for(int i=1;i<=n;i++)
        {
          int curr=(prev*(n-i+1)/i);
          ans.add(curr);
          prev=curr;
        }
        return ans;
    }
}
