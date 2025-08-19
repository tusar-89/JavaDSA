/*
Problem-->

Given two strings denoting non-negative numbers s1 and s2. Calculate the sum of s1 and s2.

https://www.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1?page=2&category=Strings&status=unsolved&sortBy=submissions

Ans-->

  */
  // Backend complete function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // Before proceeding further, make sure length
        // of s2 is larger.
        if (s1.length() > s2.length()) {
            String t = s1;
            s1 = s2;
            s2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = s1.length(), n2 = s2.length();

        // Reverse both of Strings
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int)(s1.charAt(i) - '0') + (int)(s2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int)(s2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0) str += (char)(carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        int i = 0, n = str.length();
        while (i < n && str.charAt(i) == '0') i++;

        if (i == n) return "0";

        return str.substring(i);
    }
}


//2nd method -->
import java.math.BigInteger;  

class Solution {
    String findSum(String s1, String s2) {
        BigInteger x = new BigInteger(s1);
        BigInteger y = new BigInteger(s2);
        BigInteger sum = x.add(y);
        return sum.toString();
    }
}
