/*
Problem-->

Given an integer n. Write a program to find the first prime number greater than n.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Loops-2/problem/next-prime-number--163011

Ans-->

  */
  import java.util.*;

public class Solution 
{
    public static void main(String args[]) 
    { 
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // starting number

        for (int next = n + 1; ; next++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= next; i++) {
                if (next % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(next); // next prime found
                break;
            }
        }
    }
}
