Problem-->

Given an array, arr[] of positive integers. Your task is to return the product of array elements under the given modulo,
  mod with the value of 1000000007.

Note: The modulo operation finds the remainder after the division of one number by another.
  For example, k(mod(m))=k%m= remainder obtained when k is divided by m

  https://www.geeksforgeeks.org/problems/product-of-array-element/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
Ans-->

  class Solution {
    public static long product(long arr[]) {
        // your code here
        long mod=1000000007;
        long product=1;
        int i=0;
        while(i<arr.length)
        {
            product=(product*arr[i])%mod;
              i++;
        }
       
        return product;
    }
    
}
