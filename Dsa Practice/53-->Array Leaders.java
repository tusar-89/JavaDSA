/*
Problem-->
  
  You are given an array arr of positive integers. Your task is to find all the leaders in the array.
  An element is considered a leader if it is greater than or equal to all elements to its right. 
  The rightmost element is always a leader.

  https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
  
Ans-->
  */

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
               ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        // Traverse the array from second last to the start
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }

        // Since we added leaders in reverse order, reverse the result
        Collections.reverse(result);

        return result;
    }
}
