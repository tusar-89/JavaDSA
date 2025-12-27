/* 

Problem-->

Given an array arr, find the average or mean of the prefix array at every index.

https://www.geeksforgeeks.org/problems/average4856/1?page=4&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

Ans-->

*/

class Solution {
    // Prints average of a stream of numbers
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>(
            Collections.nCopies(n, 0)); 
        int avg = 0; 
        for (int i = 0; i < n; i++) {  
            avg += arr.get(i);         
            ans.set(i, avg / (i + 1)); 
        }
        return ans; 
    }
}
