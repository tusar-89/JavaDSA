/*
Problem-->

You are given a string s, and your task is to reverse the string.

https://www.geeksforgeeks.org/problems/reverse-a-string/1?page=1&category=Strings&difficulty=Basic,Easy&sortBy=submissions

Ans-->

  */ 

class Solution {
    public static String reverseString(String s) {
        // code here
         char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
        /* 2nd method is following string builder method
        -->return new StringBuilder(s).reverse().toString(); */
    }
}
