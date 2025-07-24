/*
Problem--.

Given a number n,Find the first digit of the number.

https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day8/problem/first-digit-of-a-number

Ans-->
  */
  class Solution
  {
  public static int firstDigit(int n)
    {
    while(n>9) //(n>=10)
      {
      n=n/10;
    }
  return n;
  }
}

    
  
