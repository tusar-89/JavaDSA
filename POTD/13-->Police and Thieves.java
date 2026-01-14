/*

Problem-->

Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police. 
Keep in mind the following conditions :

1.Each policeman can catch only one thief.
2.A policeman cannot catch a thief who is more than k units away from him.


  https://www.geeksforgeeks.org/problems/police-and-thieves--141631/1

Ans-->

  */

class Solution {
    public int catchThieves(char[] arr, int k) {
        List<Integer> police = new ArrayList<>();
        List<Integer> thieves = new ArrayList<>();
        
        // Separate indices of police and thieves
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P')
                police.add(i);
            else if (arr[i] == 'T')
                thieves.add(i);
        }
        
        int i = 0, j = 0, caught = 0;
        
        // Two-pointer approach
        while (i < police.size() && j < thieves.size()) {
            if (Math.abs(police.get(i) - thieves.get(j)) <= k) {
                caught++;
                i++;
                j++;
            } else if (thieves.get(j) < police.get(i)) {
                j++;
            } else {
                i++;
            }
        }
        
        return caught;
    }
}
