/*

Problem-->

  A string s is given to represent a positive number. The task is to round str to the nearest multiple of 10.
  If you have two multiples equally apart from s, choose the smallest element among them.

  https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1?page=3&category=Strings&sortBy=submissions  

Ans-->

  */

class Solution {
    public String roundToNearest(String str) {
        int n = str.length();

        // If the last digit is less than or equal to 5
        // then it can be rounded to the nearest
        // (previous) multiple of 10 by just replacing
        // the last digit with 0
        if (str.charAt(n - 1) - '0' <= 5) {

            // Set the last digit to 0
            str = str.substring(0, n - 1) + '0';

            // Return the updated number
            return str;
        }
        // The number has to be rounded to the next multiple of 10
        else {
            // Replace the last digit with 0
            str = str.substring(0, n - 1) + '0';

            // Starting from the second last digit, add 1 to digits while there is carry
            int carry = 1;
            char[] chars = str.toCharArray();
            for (int i = n - 2; i >= 0 && carry == 1; i--) {
                int currentDigit = chars[i] - '0';
                currentDigit += carry;

                // If the digit exceeds 9 then the carry will be generated
                if (currentDigit > 9) {
                    carry = 1;
                    currentDigit = 0;
                }
                // Else there will be no carry
                else {
                    carry = 0;
                }

                // Update the current digit
                chars[i] = (char)(currentDigit + '0');
            }

            // If the carry is still 1 then it must be inserted at the beginning of the
            // string
            if (carry == 1) {
                return '1' + new String(chars);
            }

            // Return the updated number
            return new String(chars);
        }
    }
}
