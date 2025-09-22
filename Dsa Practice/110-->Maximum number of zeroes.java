/*
Problem-->

Given an array arr[] of integers, the task is to find the number that has the maximum number of zeroes. If there are no zeroes then print -1.

Note: If there are multiple numbers with the same (max) number of zeroes then print the Maximum number among them.

https://www.geeksforgeeks.org/problems/maximum-number-of-zeroes4048/1?page=1&status=attempted&sortBy=submissions

Ans-->

  */

class Solution {
    public String maxZero(ArrayList<String> arr) {
        // Code here
             int maxZeroCount = 0;
        String result = "-1";

        for (String numStr : arr) {
            int zeroCount = countZeros(numStr);

            if (zeroCount > maxZeroCount) {
                maxZeroCount = zeroCount;
                result = numStr;
            } else if (zeroCount == maxZeroCount) {
                if (isGreater(numStr, result)) {
                    result = numStr;
                }
            }
        }

        return (maxZeroCount == 0) ? "-1" : result;
    }

    // Count zeros in string
    private int countZeros(String numStr) {
        int count = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') count++;
        }
        return count;
    }

    // Compare numbers as strings (no BigInteger needed)
    private boolean isGreater(String a, String b) {
        if (b.equals("-1")) return true;  // for first valid number
        if (a.length() != b.length()) return a.length() > b.length();
        return a.compareTo(b) > 0;
    }
    
}
