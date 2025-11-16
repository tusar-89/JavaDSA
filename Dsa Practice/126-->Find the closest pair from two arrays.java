 /*
    
Problem-->

Given two sorted arrays arr and brr and a number x, find the pair whose sum is closest to x and the pair has an element from each array.
   In the case of multiple closest pairs return any one of them.
Note: Can return the two numbers in any manner. The driver code takes care of the printing of the closest difference.   

https://www.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1?page=2&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions  

Ans-->

  */

// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m,
                                                  int x) {
        // code here
        int i = 0;          // pointer for arr[]
        int j = m - 1;      // pointer for brr[]
        int diff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            int currDiff = Math.abs(sum - x);

            // update if we found a closer pair
            if (currDiff < diff) {
                diff = currDiff;
                num1 = arr[i];
                num2 = brr[j];
            }

            // Move pointers based on comparison
            if (sum > x)
                j--; // need smaller sum
            else
                i++; // need larger sum
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(num1);
        result.add(num2);
        return result;
    }
}
