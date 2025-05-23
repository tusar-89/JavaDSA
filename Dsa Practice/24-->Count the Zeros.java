Problem-->
  
Given an array arr of only 0's and 1's. The array is sorted in such a manner that all the 
 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.

  https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count =0;
        for(int ele:arr)
        {
          if(ele==0)
          {
              count++;
          }
        }
        return count;
    }
}
