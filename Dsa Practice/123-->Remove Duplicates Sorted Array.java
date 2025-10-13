/*

Problem--> 

You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once.
Return an array containing these distinct elements in the same order as they appeared.

https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?page=4&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
  
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
                 }
            }
              return result;
      }
      
  }
