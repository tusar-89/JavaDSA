Problem-->

Given an array, arr[] of positive elements, and an integer k, the task is to left-rotate the array k indexes.
Note: Rotate the array even if the k is greater than the size of the array. In these cases after every full array rotation,
the array comes the same as the original array.

https://www.geeksforgeeks.org/problems/quick-left-rotation3806/1?page=2&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions

Ans-->  

class Solution {
    void leftRotate(int arr[], int k) {
       int n=arr.length;
       k%=n;
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
       reverse(arr,0,n-1);
    }
       static void reverse(int arr[],int start,int end)
       {
           while(start<end)
           {
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
           }
       }
    
}
