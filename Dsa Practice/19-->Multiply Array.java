Problem-->
Calculate the product of all the elements in an array.

  https://www.geeksforgeeks.org/problems/multiply-array-1658312632/1?page=4&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions

Ans-->

  class Solution {

    public static int product(int arr[], int n) 
    {
        int pt=1;
        for(int i=0;i<n;i++)
        {
            pt*=arr[i];
        }
        return pt;
    }
}

