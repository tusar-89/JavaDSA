/*
Problem-->

  Given the first 2 terms a1 and a2 of an Arithmetic Series. Find the nth term of the series. 

  https://www.geeksforgeeks.org/problems/series-ap5310/1?page=2&difficulty=Basic&status=unsolved&sortBy=submissions

  Ans-->

  
  */


class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
         int d = a2 - a1;
        
        return a1 + (n - 1) * d;
    }
}
