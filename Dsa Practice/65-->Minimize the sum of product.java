/*
Problem-->

You are given two arrays arr1 and arr2. The task is to find the minimum value of
arr1[0] * arr2[0] + arr1[1] * arr2[1] + .... + arr1[N-1] * arr2[N-1], 
where the shuffling of elements of arrays arr1 and arr2 is allowed.

https://www.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
         Collections.sort(arr1);
        
        // Sort arr2 in descending order
        Collections.sort(arr2, Collections.reverseOrder());

        long result = 0;
        int n = arr1.size();
        for (int i = 0; i < n; i++) {
            result += (long) arr1.get(i) * arr2.get(i);
        }

        return result;
    }
}
