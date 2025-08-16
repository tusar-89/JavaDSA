/*
Problem-->

Given a string s, you need to check if it is palindrome or not. A palidrome is a string that reads the same from front and back.

Note: Ignore the case in this question.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-String-2/problem/check-palindrome--141628\

Ans-->

  */

class Solution {
    public static boolean isPalindrome(String s) {
        // code here 
        s = s.toLowerCase();
          int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
