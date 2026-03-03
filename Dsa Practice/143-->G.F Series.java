Problem-->

Siddhant made a special series and named it as G.F Series. The series follows this trend  Tn=(Tn-2)2-(Tn-1)  in which the first and the second term are 0 and 1 respectively.
Help Siddhant to find the first n terms of the series.

Note: Print a white space (" ") after every integer and a newline character after every testcase.

https://www.geeksforgeeks.org/problems/gf-series3535/1?page=1&category=Recursion&difficulty=Basic&sortBy=submissions

Solution-->

  //User function Template for Java
class Solution {
    public void gfSeries(int N) {
        // array to store the generated series
        long[] dp = new long[N+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i < N; i++) {
            dp[i] = (long) ((dp[i-2]*dp[i-2]) - dp[i-1]);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(dp[i] + " ");
        }
        
        System.out.println();
    }
}
