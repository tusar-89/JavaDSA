/*
Problem-->
  
Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         HashMap<Integer, Integer> freqA = new HashMap<>();

        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!freqA.containsKey(num) || freqA.get(num) == 0) {
                return false;
            }
            freqA.put(num, freqA.get(num) - 1);
        }

        return true;
    }
}
