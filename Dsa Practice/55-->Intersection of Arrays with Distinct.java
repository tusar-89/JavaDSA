/*
Given two unsorted integer arrays a[] and b[] each consisting of distinct elements,
the task is to return the count of elements in the intersection (or common elements) of the two arrays.

Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here HashSet<Integer> setA = new HashSet<>();
       HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        int count = 0;
        for (int num : b) {
            if (setA.contains(num)) {
                count++;
                setA.remove(num); // remove to ensure distinct counting
            }
        }

        return count;
        
    }
}
