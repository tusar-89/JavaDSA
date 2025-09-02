/*
Problem-->

Given two strings s1 and s2 which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character.

Your task to find the extra character in the second string and return it.

https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day12/problem/find-one-extra-character

Ans-->

  */

class Solution {
    public static char extraChar(String s1, String s2) {

        int res = 0;

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }

        res = res ^ s2.charAt(n);

        return (char)res;
    }
}
