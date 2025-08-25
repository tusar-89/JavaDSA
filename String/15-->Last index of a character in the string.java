/*
Problem-->

  Given a string S  and a character X, the task is to find the last index (0 based indexing) of X in string S.
  If no index found then the answer will be -1.

  https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1?page=3&category=Strings&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    int LastIndex(String s, char p) {
        // code here
         int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p) {
                lastIndex = i;  // update when found
            }
        }
        return lastIndex;
    }
}
