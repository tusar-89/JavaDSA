/*
Problem-->

Given two integer arrays a[] and b[], you have to find the intersection of the two arrays.
Intersection of two arrays is said to be elements that are common in both the arrays.
The intersection should not have duplicate elements and the result should contain items in any order.

Note: The driver code will sort the resulting array in increasing order before printing.

https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1?page=5&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

  Ans-->
  */

  class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
         Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add all elements of array a to setA
        for (int num : a) {
            setA.add(num);
        }

        // Check which elements of array b are in setA
        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num); // add to result set (ensures uniqueness)
            }
        }

        return new ArrayList<>(result);
    }
}
