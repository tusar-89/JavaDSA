/*
Problem-->

Juggler Sequence is a series of integers in which the first term starts with a positive integer number a and the remaining terms are generated from the immediate previous term 
using the below recurrence relation:

Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.

https://www.geeksforgeeks.org/problems/juggler-sequence3930/1?page=3&category=Recursion&sortBy=submissions

Ans-->

  
class Solution {
    static List<Long> jugglerSequence(long n) {
        // Initializing the result list with the initial number
        List<Long> res = new ArrayList<>();
        res.add(n);

        // Loop until the number becomes 1
        while (n > 1) {
            // If the number is odd, perform the juggler equation
            if (n % 2 == 1) n = (long)(Math.sqrt(n) * n);
            // If the number is even, perform the juggler equation
            else
                n = (long)Math.sqrt(n);

            // Add the number to the result list
            res.add(n);
        }

        // Return the final result list
        return res;
    }
}
