/*
Problem-->

  Given an array arr of distinct elements,
  the task is to return an array of all elements except the two greatest elements in sorted order.

  https://www.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        int n=arr.length;
        if(n<=2)
        {
            return new long[]{};
            
        }
        Arrays.sort(arr);
        long []result=new long[n-2];
        for(int i=0;i<n-2;i++)
        {
            result[i]=arr[i];
        }
        return result;
    }
}
