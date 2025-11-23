/* 

Problem-->

Given an array, arr[]. Sort the array using bubble sort algorithm.

https://www.geeksforgeeks.org/problems/bubble-sort/1?page=1&category=Sorting&sortBy=submissions

Ans-->

  */

class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

