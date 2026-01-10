/*

Problem-->

You are given a string s consisting of lowercase characters and an integer k, You have to count all possible substrings that have exactly k distinct characters.

https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1

Ans-->

*/

import java.util.*;

class Solution {
    public int countSubstr(String s, int k) {
        // Substrings with exactly k distinct characters =
        // atMost(k) - atMost(k - 1)
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    // Helper function: counts substrings with at most K distinct characters
    private int countAtMostK(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // If more than k distinct, shrink from left
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            // Add all substrings ending at 'right'
            count += (right - left + 1);
        }

        return count;
    }
}
