/*
Problem-->

  Given an array arr of integers, find all the elements that occur more than once in the array.
  If no element repeats, return an empty array.

  https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        
    Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
