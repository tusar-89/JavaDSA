/*
Problem-->

  Given a string S, the task is to create a string with the first letter of every word in the string.

  https://www.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1?page=1&category=Strings&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    String firstAlphabet(String S) {
        // code here
         String[] words = S.split(" ");   // Split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.charAt(0));  // Take first character
            }
        }
        return result.toString();
    }
};
