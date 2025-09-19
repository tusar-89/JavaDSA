/*
Problem-->

  You are given the heights of consecutive buildings. You can move from the roof of a building to the roof of the next adjacent building.
  You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

  https://www.geeksforgeeks.org/problems/roof-top-1587115621/1?page=2&category=Arrays,Strings&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans--> 

  */

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
         int max = 0;
        int current = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;           // valid step
                max = Math.max(max, current);
            } else {
                current = 0;         // reset if not increasing
            }
        }

        return max;
    }
}
