/*
Problem-->

  Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array.
  Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

  https://www.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1?page=2&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
  */
class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
         ArrayList<Integer> result = new ArrayList<>();

        // 1. Sum of left diagonal
        int sumDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonal += a[i][i];
        }

        // 2. Max element in b[]
        int maxElement = b[0];
        for (int i = 1; i < n; i++) {
            if (b[i] > maxElement) {
                maxElement = b[i];
            }
        }

        // Add to result
        result.add(sumDiagonal);
        result.add(maxElement);

        return result;
    }
}
