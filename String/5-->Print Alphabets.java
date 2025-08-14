/*
Problem-->

  Given two char c1 and c2.  you need to print all the alphabet starting from c1 to c2 in a single line.
Note: Print all characters with a single space after it and all in a single line. Don't add a new line after printing.

  https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-String-2/problem/print-alphabets--141628

  Ans-->

  */

class Solution {
    public static void alphabets(char c1, char c2) {
        // code here
        for(char ch=c1;ch<=c2;ch++ )
        {
            System.out.print(ch+" ");
        }
    }
}
