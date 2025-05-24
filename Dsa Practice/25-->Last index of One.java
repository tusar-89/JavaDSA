Problem-->

Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.
Note: If '1' is not present, return "-1"

  https://www.geeksforgeeks.org/problems/last-index-of-15847/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  class Solution
{
   public int lastIndex(string s)
  {
     for(int i=s.length()-1;i>=0;i--)
       {
       if(s.charAt(i)=='1')
       { 
         return i;
       }
   }
     return -1;
   }
}
