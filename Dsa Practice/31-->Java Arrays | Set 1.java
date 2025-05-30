Problem-->
  
Given an array arr[] containing the prices of items,
  your task is to calculate the average of all prices, rounded to two decimal places.
  
Note:  Return the average of all the items as a String.

  https://www.geeksforgeeks.org/problems/java-arrays-set-11354/1?page=5&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  class Solution {
    public String average(int arr[]) {
        // code here
        int sum =0;
        for(int ele:arr)
        {
            sum+=ele;
        }
        double avg=(double)sum/arr.length;
       
        return String.format("%.2f",avg);
    }
}
