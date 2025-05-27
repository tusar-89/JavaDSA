Problem-->

Given an unsorted array arr[] of integers and a key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ) return an array of length 2 with elements start index and end index.(0 based indexing is used)

If the key does not exist in the array then return -1 for both start and end index in this case.

  https://www.geeksforgeeks.org/problems/find-index4752/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
Ans-->

  class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==key&&start==-1)
           {
              start=i; 
           }
            
        }
        for(int j=arr.length-1;j>=0;j--)
        {
            if(arr[j]==key&&end==-1)
            {
                end=j;
            }
        }
        return new int[]{start,end};
    }
}
