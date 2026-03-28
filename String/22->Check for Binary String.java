/*
Problem-->
  
Given a non-empty sequence of characters s, return true if sequence is Binary, else return false.

https://www.geeksforgeeks.org/problems/check-for-binary/1?page=1&category=Strings&difficulty=Basic&status=solved,unsolved&sortBy=submissions

Ans-->

  */
class Solution {
    boolean isBinary(String s) {
        for (char ch : s.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }
}
