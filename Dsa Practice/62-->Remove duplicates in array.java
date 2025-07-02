/*
Problem-->

Given an array arr consisting of positive integer numbers, remove all duplicate numbers.

  https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

*/

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
         LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            set.add(num); // duplicates will be ignored automatically
        }
        
        // Convert set to ArrayList
        return new ArrayList<>(set);
    }
}
