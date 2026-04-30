/*

Prroblem-->

https://www.geeksforgeeks.org/problems/lemonade-change/1 

Ans-->

*/

class Solution {
    public boolean canServe(int[] arr) {
        int five = 0, ten = 0; // Track count of 5 and 10 coins

        for (int bill : arr) {
            if (bill == 5) {
                // Customer pays exact amount, no change needed
                five++;
            } 
            else if (bill == 10) {
                // Need to give back one 5 as change
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false; // Can't give change
                }
            } 
            else if (bill == 20) {
                // Need to give back 15 as change
                if (ten > 0 && five > 0) {
                    // Prefer one 10 + one 5
                    ten--;
                    five--;
                } else if (five >= 3) {
                    // Otherwise, give three 5s
                    five -= 3;
                } else {
                    return false; // Not enough change
                }
            }
        }

        return true; // Successfully served all passengers
    }
}
