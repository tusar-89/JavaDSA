Problem-->
  
  Given an array arr[] containing strings of names. Your task is to return the longest string.
    If there are multiple names of the longest size, return the first occurring name.
    
https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->

  import java.util.*;

class Solution {
    public String longest(List<String> arr) {
        if (arr == null || arr.isEmpty()) {
            return "";
        }

        String longest = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).length() > longest.length()) {
                longest = arr.get(i);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read entire line of input
        String line = sc.nextLine();

        // Split the line by spaces into a list
        List<String> words = Arrays.asList(line.split(" "));

        Solution sol = new Solution();
        System.out.println(sol.longest(words));
    }
}
