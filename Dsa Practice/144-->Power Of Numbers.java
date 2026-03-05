Problem-->

Given a number n, find the value of n raised to the power of its own reverse.
Note: The result will always fit into a 32-bit signed integer.

https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?page=1&category=Recursion&sortBy=submissions

Solution-->

  class Solution {
    int mod=1000000007;
    public int reverseExponentiation(int n) {
        // code here
        
        int reversed=reverseNumber(n);
        return powerNum(n,reversed);
    }
    public int reverseNumber(int n)
    {
       int rev=0;
       while(n>0)
       {
          rev=rev*10+n%10;
          n=n/10;
       }
       return rev;
    }
    public int powerNum(int base,int pow)
    {
        if(base==0)
        return 0;
        
        if(pow==0)
        return 1;
        
        int result;
        if(pow%2==0)
        {
            result=powerNum(base,pow/2);
            return result*result%mod;
        }
        else
        {
            result=powerNum(base,pow/2);
            return result*result*base%mod;
        }
    }
}
