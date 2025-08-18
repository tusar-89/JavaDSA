/*
Problem-->

Given a decimal number n (positive) in string format, compute its binary string equivalent and return it. 
Note: Don't add a new line at the end.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-String-2/problem/decimal-number-to-binary-number--141631

Ans-->
*/

  class Solution {
    public static String toBinary(int n) {
        // Code here
        if (n == 0) return "0"; // edge case
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary; // prepend remainder
            n = n / 2;
        }
        return binary;
      /*2nd method -->
        return Integer.toBinaryString(n);*/
    }
}
