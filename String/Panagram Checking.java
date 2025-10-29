/*
  
Problem-->

Given a string s, check if it is a "Panagram" or not. Return true if the string is a Panagram, else return false.
A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1?page=3&category=Strings&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    public static boolean checkPangram(String s) {
        // code here
        boolean[] seen = new boolean[26];
        s = s.toLowerCase();  
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);   
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true; 
            }
        }
     
        for (boolean present : seen) {
            if (!present)
                return false; 
        }

        return true;  
    }
}
