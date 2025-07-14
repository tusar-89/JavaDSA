/*
Problem-->

  Given an unsorted array arr[] and two elements num1 and num2. 
  The task is to count the number of elements that occur between the given elements (excluding num1 and num2). 
  If there are multiple occurrences of num1 and num2,
  we need to consider the leftmost occurrence of num1 and the rightmost occurrence of num2.

  https://www.geeksforgeeks.org/problems/count-number-of-elements-between-two-given-elements-in-array4044/1?page=8&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
  */

class Solution {
    // Function to get the count of elements between num1 and num2 in array arr.
    public int getCount(ArrayList<Integer> arr, int num1, int num2) {
        // Your Code goes here.
     int leftIndex=-1;
     int rightIndex=-1;
     for(int i=0;i<arr.size();i++)
     {
        if(arr.get(i)==num1)
        {
            leftIndex=i;
            break;
        }
     }
     for(int j=arr.size()-1;j>=0;j--)
     {
         if(arr.get(j)==num2)
         {
             rightIndex=j;
             break;
         }
     }
     if(leftIndex !=-1 && rightIndex !=-1 && leftIndex<rightIndex)
     {
         return rightIndex-leftIndex-1;
     }
     return 0;
     
    }
}
