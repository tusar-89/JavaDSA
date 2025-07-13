/*
Problem-->

  Given an integer year. Print "True" (without quotes) if it can represent a leap year, 
  otherwise print "False" (without quotes).

  https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Flow-Control-2/problem/leap-year-1598599919--155509

Ans-->
  */

import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
        if(year%4==0&&year%100!=0)
        {
        System.out.println("True");
        }
        else if(year%400==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
