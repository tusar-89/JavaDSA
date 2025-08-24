/*
Problem-->

  Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum equals x.
Note: The pair has an element from each array.

  https://www.geeksforgeeks.org/problems/count-pair-sum5956/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
  */
class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
   
    public static int countPairs(int[] arr1, int[] arr2, int x) {
        int i = 0;                // start of arr1
        int j = arr2.length - 1;  // end of arr2
        int count = 0;

        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];

            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

}
