/*
Problem-->

You are given an integer n. You need to convert all zeroes of n to 5.

https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    int convertfive(int num) {
        // Your code here
         String numStr = String.valueOf(num);
        numStr = numStr.replace('0', '5');
        return Integer.parseInt(numStr);
        
    }
}
