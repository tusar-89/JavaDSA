/*
problem-->

Given an array arr[]. The task is to find the number of odd and even elements in the array.

https://www.geeksforgeeks.org/problems/count-odd-even-java/1?page=5&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    public static void countOddEven(Integer arr[]) {

        // Your code here
        int odd = 0, even = 0;
        
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        // Print the result
        System.out.println(odd + " " + even);
    }
}
