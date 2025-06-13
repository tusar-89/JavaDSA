/*
Problem-->
  
Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array.
If both elements have the same frequency, then return the smaller element.
  
Note:  We need to return the element, not its count.

  Ans-->
  */
class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
         int countX = 0, countY = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x) countX++;
            if (arr[i] == y) countY++;
        }

        if (countX > countY) return x;
        else if (countY > countX) return y;
        else return Math.min(x, y); 
    }
}
