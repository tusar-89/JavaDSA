Problem-->

  Print numbers from N to 1 (space separated) without the help of loops.

  https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

Solution-->

  class Solution {

    void printNos(int N) {
        // code here
        if (N == 0)
            return;
        System.out.print(N + " ");
        
        // recursive call
        printNos(N - 1);
    }
}
