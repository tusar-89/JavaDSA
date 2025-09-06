/*
Problem-->

  Given a binary string s. You have to count the number of substrings that start and end with 1.

  https://www.geeksforgeeks.org/problems/binary-string-1587115620/1?page=3&category=Strings&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    public int binarySubstring(String s) {
        int countOnes = 0;

        // Count number of '1's in the string
        for (char ch : s.toCharArray()) {
            if (ch == '1') countOnes++;
        }

        // Formula: nC2 = n * (n - 1) / 2
        // This counts substrings of length >= 2
        return (countOnes * (countOnes - 1)) / 2;
    }
}
