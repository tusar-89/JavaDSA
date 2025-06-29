/*
Problem-->

Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.

Two arrays are said to be equal if both contain the same set of elements,
arrangements (or permutations) of elements may be different though.

Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
*/

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        if (a.length != b.length) return false;

        int max = 100001; // Assume elements are in range [0, 100000]
        int[] countA = new int[max];
        int[] countB = new int[max];

        for (int i = 0; i < a.length; i++) {
            countA[a[i]]++;
            countB[b[i]]++;
        }

        for (int i = 0; i < max; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }

        return true;
    }
}
