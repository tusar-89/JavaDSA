/*
Problem-->

You are given two numbers a and b. Your task is to swap the given two numbers.

Note: Try to do it without a temporary variable.

https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1?page=2&category=Mathematical&sortBy=submissions

Ans-->
*/
class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        a = a + b;
        b = a - b;
        a = a - b;

        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
}
