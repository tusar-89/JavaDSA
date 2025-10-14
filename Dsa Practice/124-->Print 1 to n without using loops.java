/*

Problem-->

Given an positive integer n, print numbers from 1 to n without using loops.

Implement the function printTillN() to print the numbers from 1 to n as space-separated integers.

  https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1?page=2&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    static void printTillN(int N) {
        // code here
        if(N==0)
        {
            return;
        }
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
