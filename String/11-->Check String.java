/* 
Problem-->
   
Given a string, check if all its characters are the same or not.

 https://www.geeksforgeeks.org/problems/check-string1818/1?page=1&category=Strings&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Sol {
    Boolean check(String s) {
        // your code here
        if (s.length() <= 1) return true;

        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != first) {
                return false; // Found a different char
            }
        }
        return true; // All same
    }
}
