/*
Problem-->

Given a string s without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.

Note: The original order of characters must be kept the same. 

https://www.geeksforgeeks.org/problems/remove-duplicates3034/1?page=2&category=Strings&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    String removeDups(String s) {
        // code here
         boolean[] seen = new boolean[256]; // assuming extended ASCII
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}
