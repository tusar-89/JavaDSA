/*
Problem-->

Given a natural number n. You have to find the number of digits in it and return it.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Loops-2/problem/count-digits-1606889545--123832\

Ans-->

  */

import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        int count=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       while (n>0)
       {
          n =n/10;
          count++;
       }
        System.out.println(count);
    }
}
  
