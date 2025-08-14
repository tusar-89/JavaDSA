/*
problem-->

Given a string s, you need to perform the following operation.

1. Capitalize the first letter and print in a new line.
2. Convert the whole string to uppercase and print in a new line.

  https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-String-2/problem/change-case--141628

  Ans-->

  */

class Solution {
    public static void changeCase(String s) {
        
        // code here
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
        System.out.println(s.toUpperCase());
       
    }
}
