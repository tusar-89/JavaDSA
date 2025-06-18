/*
Problem-->
  
Given an array arr[] containing strings of names. Your task is to return the longest string. 
  If there are multiple names of the longest size, return the first occurring name.

  https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
*/
  
class Solution {
    public String longest(List<String> arr) {
        // code here
        String longestName = "";
        for (String name : arr) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        return longestName;
    }
}
