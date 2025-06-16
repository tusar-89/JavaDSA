/*
Problem-->

  Given two integer arrays a and b, the task is to find the numbers which are present in the first array a, 
  but not present in the second array b.

Note: Numbers to be returned should in order as they appear in array a.

https://www.geeksforgeeks.org/problems/in-first-but-second5423/1?page=2&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        
             ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            // Check if a[i] exists in array b
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            // If not found in b, add to result
            if (!found) {
                result.add(a[i]);
            }
        }

        return result;
        }
    }
