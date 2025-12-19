/* 
Problem-->

You are given an integer n. You have  to print all numbers from 1 to n.
Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.

https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=3&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public void printNos(int N) {
        if (N > 0) 
        {
            printNos( N -1); 
            System.out.print(N + " "); 
        }
        return;
    }
}
