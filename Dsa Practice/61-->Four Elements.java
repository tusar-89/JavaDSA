/*
Problem-->

  Given an array A of N integers. You have to find whether a combination of
  four elements in the array whose sum is equal to a given value X exists or not.

  You don't need to read input or print anything. Your task is to complete the function find4Numbers() which takes the array A[], 
  its size N and an integer X as inputs and returns true if combination is found else false.
  Driver code will print 1 or 0 accordingly.

  Ans-->
  */

class Compute {
    boolean find4Numbers(int A[], int n, int X) {
        Map<Integer, List<int[]>> map = new HashMap<>();

        // Store all possible pairs with their sums
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = A[i] + A[j];
                map.computeIfAbsent(sum, k -> new ArrayList<>()).add(new int[]{i, j});
            }
        }

        // Traverse all pairs again to find if (X - sum) exists
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int target = X - (A[i] + A[j]);
                if (map.containsKey(target)) {
                    for (int[] pair : map.get(target)) {
                        // Ensure all indices are different
                        if (pair[0] != i && pair[0] != j && pair[1] != i && pair[1] != j) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;}
}
