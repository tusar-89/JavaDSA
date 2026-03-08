Problem-->

You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

https://www.geeksforgeeks.org/problems/digital-root/1?page=2&category=Recursion&sortBy=submissions

Ans-->

class Solution {
    public static int digitalRoot(int n) {
        // code here
        if(n>0&&n<=9) return n;
        int res=0;
        while(n>0)
        {
            res=res+n%10;
            n=n/10;
        }
        return digitalRoot(res);
    }
}
