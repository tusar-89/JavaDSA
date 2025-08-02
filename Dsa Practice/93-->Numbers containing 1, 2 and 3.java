/*
Problem-->

You are given an array arr[] of integers. Find all the numbers in the array whose digits consist only of [1, 2, 3].
Return an array containing only those numbers from arr[]. The order of the numbers in the output array should be the same as their order in the input array.
If there is no such element in arr[]. Return [-1].

https://www.geeksforgeeks.org/problems/numbers-containing-1-2-and-32555/1?page=1&sprint=1c2ac62dc107619a92588b732213979b&sortBy=submissions

Ans-->

  */

class Solution {
    // Function to filter numbers that contain only digits 1, 2, or 3
    public ArrayList<Integer> filterByDigits(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse each number in the input array
        for (int num : arr) {
            if (num == 0) continue; // Skip 0 as it contains invalid digit (0)

            boolean isValid = true;
            int temp = num;

            // Check each digit of the current number
            while (temp > 0) {
                int digit = temp % 10;
                // If any digit is not 1, 2, or 3, mark as invalid and break
                if (digit != 1 && digit != 2 && digit != 3) {
                    isValid = false;
                    break;
                }
                temp /= 10; // Move to the next digit
            }

            // If all digits are valid, add number to result list
            if (isValid) {
                result.add(num);
            }
        }

        // Return the filtered list
        return result;
    }
}

