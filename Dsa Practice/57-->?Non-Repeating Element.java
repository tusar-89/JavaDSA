/*
Problem-->

Find the first non-repeating element in a given array arr of integers and if
there is not present any non-repeating element then return 0

Note: The array consists of only positive and negative integers and not zero.

  https://www.geeksforgeeks.org/problems/non-repeating-element3958/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

*/

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
       
         HashMap<Integer, Integer> freq = new HashMap<>();
        
        // Step 1: Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find first element with frequency 1
        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }
        
        return 0; // No non-repeating element found
    }
}
