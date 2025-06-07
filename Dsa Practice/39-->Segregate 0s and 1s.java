/*
Problem-->

  Given an array arr consisting of only 0's and 1's in random order. 
  Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

  https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Increment left index while we see 0 at left
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Decrement right index while we see 1 at right
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // If left is smaller than right then swap
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

}
