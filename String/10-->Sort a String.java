/* 
Problem-->
  
Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

  https://www.geeksforgeeks.org/problems/sort-a-string2943/1?page=1&category=Strings&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    String sort(String s) {
        // code here
         char[] arr = s.toCharArray();   
        Arrays.sort(arr);            
        return new String(arr);     
    }
}
