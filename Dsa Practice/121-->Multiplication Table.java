/*

Problem-->

  Create the multiplication table from 1 to 10 for a given number n and return the table as an array.

  https://www.geeksforgeeks.org/problems/print-table0303/1?page=2&difficulty=Basic&status=unsolved&sortBy=submissions
  
  Ans-->

  */

// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> table = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            table.add(n * i);
        }
        
        return table;

    }
}
