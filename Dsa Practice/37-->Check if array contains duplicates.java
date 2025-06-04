/*
Problem-->

  Given an integer array arr[], check if the array contains any duplicate value.

  https://www.geeksforgeeks.org/problems/check-if-array-contains-duplicates/1?page=18&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */
class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
         HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates
    
    }
}
