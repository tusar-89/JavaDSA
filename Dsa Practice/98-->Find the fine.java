/*
Problem-->

  Given an array of car numbers car[], an array of penalties fine[], and an integer value date. 
  The task is to find the total fine which will be collected on the given date.
  The fine is collected from odd-numbered cars on even dates and vice versa.

  https://www.geeksforgeeks.org/problems/find-the-fine4353/1?page=1&category=Arrays&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->

  */

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
       long total = 0;

        for (int i = 0; i < car.length; i++) {
            // Even date -> fine from odd-numbered cars
            // Odd date  -> fine from even-numbered cars
            if ((date % 2 == 0 && car[i] % 2 != 0) || (date % 2 != 0 && car[i] % 2 == 0)) {
                total += fine[i];
            }
        }

        return total; 
    }
}
