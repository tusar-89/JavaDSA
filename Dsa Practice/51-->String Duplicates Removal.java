/*
Problem-->

  Given a string s which may contain lowercase and uppercase characters.
  The task is to remove all duplicate characters from the string and find the resultant string. 
  The order of remaining characters in the output should be same as in the original string.

  https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
 */

class Solution {
    String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();}
}
