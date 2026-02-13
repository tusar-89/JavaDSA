/* 
Problem-->
  
Given a string s. Your task is to remove the vowels from the string.

https://www.geeksforgeeks.org/problems/remove-vowels-from-string1446/1?page=5&category=Strings&status=unsolved&sortBy=submissions

Ans-->

  */

// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        return s.replaceAll("[aeiouAEIOU]","");
    }
}
