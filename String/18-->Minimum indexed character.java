/*
Problem-->
  
  Given a string s1 and another string s2. Find the minimum index of the character in s1 that is also present in s2. if no character common in both then return -1.

  https://www.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1?page=3&category=Strings&status=unsolved&sortBy=submissions

  Ans-->

 */

class Solution {
    public static int minIndexChar(String s1, String s2) {
        // code here
        
              int minIndex = Integer.MAX_VALUE;

        for (char c : s2.toCharArray()) {
            int idx = s1.indexOf(c);
            if (idx != -1) {
                minIndex = Math.min(minIndex, idx);
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
        }
    }
