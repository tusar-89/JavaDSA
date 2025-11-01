/*

Problem-->

Given an array arr, use selection sort to sort arr[] in increasing order.

geeksforgeeks.org/problems/selection-sort/1

Ans-->

*/

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min_indx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_indx])
                {
                    min_indx=j;
                }
            }
        
        int temp=arr[i];
        arr[i]=arr[min_indx];
        arr[min_indx]=temp;
        }
    }
}
