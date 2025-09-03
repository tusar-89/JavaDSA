/*
Problem-->

Given a string b representing a Binary Number, The problem is to find its decimal equivalent.

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-String-2/problem/binary-number-to-decimal-number3525

Ans-->

*/

// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int n=b.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            char ch=b.charAt(i);
            if(ch=='1')
            {
                ans+=Math.pow(2,n-1-i);
            }
          
        }
        return ans;
    }
}
