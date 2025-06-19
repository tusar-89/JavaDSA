/*
Problem-->

  Given a sorted array, arr[] containing only 0s and 1s, find the transition point,
  i.e., the first index where 1 was observed, and before that, only 0 was observed.  
  If arr does not have any 1, return -1. If array does not have any 0, return 0.

  https://www.geeksforgeeks.org/explore?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions&_gl=1*1ri8wx8*_up*MQ..*_gs*MQ..&gclid=Cj0KCQjw_dbABhC5ARIsAAh2Z-SfiJaHHy1bZYz4q7pdC2n1BGzoVoPp9R6kFl7eI_-smADxfiCM1oUaAixREALw_wcB&gbraid=0AAAAAC9yBkDw4_YkgPyIPaXbQzBuBm-76

Ans-->
  */
class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int result ;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==1)
           {
              return i; 
           }
        }
        return -1;
    }
}
