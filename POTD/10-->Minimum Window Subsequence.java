/*

Problem-->

You are given two strings, s1 and s2. Your task is to find the smallest substring in s1 such that s2 appears as a subsequence within that substring.

The characters of s2 must appear in the same sequence within the substring of s1.
If there are multiple valid substrings of the same minimum length, return the one that appears first in s1.
If no such substring exists, return an empty string.

  https://www.geeksforgeeks.org/problems/minimum-window-subsequence/1

Ans-->

  */

class Solution {
    public String minWindow(String s1, String s2) {
        // initialize the lengths of strings s1 and s2
        int m = s2.length(), n = s1.length();

        // initialize a dp array to store minimum window lengths
        int[][] dp = new int[m + 1][n + 1];

        // calculate dp array values using dynamic programming
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j + 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s2.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        // variables to store the start index and length of the minimum window
        int start = 0, len = n + 1;

        // find the minimum window by iterating through the dp array
        for (int j = 1; j <= n; j++) {
            if (dp[m][j] != 0) {
                if (j - dp[m][j] + 1 < len) {
                    start = dp[m][j] - 1;
                    len = j - dp[m][j] + 1;
                }
            }
        }

        // return the minimum window substring or an empty string if no window exists
        return len == n + 1 ? "" : s1.substring(start, start + len);
    }
}
