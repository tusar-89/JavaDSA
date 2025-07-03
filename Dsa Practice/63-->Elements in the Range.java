/*
Problem-->
  Given an array arr[] containing positive elements. A and B are two numbers defining a range. 
  The task is to check if the array contains all elements in the given range (inclusive).

Note: If the array contains all elements in the given range return true otherwise return false.

  https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) 
    { 
        Set<Integer> set = new HashSet<>();
        
        // Add all elements of array to the set
        for (int num : arr) {
            set.add(num);
        }
        
        // Check if all elements from A to B are present
        for (int i = A; i <= B; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        
        return true;
        
    }
}
