/*
Problem-->

  Given an array, arr of positive integers. Find the third largest element in it.
  Return -1 if the third largest element is not found.

  https://www.geeksforgeeks.org/problems/third-largest-element/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
  
  Ans-->
  */
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        
       int n = arr.length;
        if (n < 3) return -1;

        // Initialize the three largest elements
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num >= first) {
                third = second;
                second = first;
                first = num;
            } else if (num >= second) {
                third = second;
                second = num;
            } else if (num >= third) {
                third = num;
            }
        }

        return third;
    }
}
