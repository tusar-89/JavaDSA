Problem-->
  Given an array arr[]. The task is to find the largest element and return it.

    https://www.geeksforgeeks.org/problems/largest-element-in-array4009--142158/1?page=18&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

class Solution {
    public static int largest(int[] arr) {
        // code here
        int cur=arr[0];
        for(int ele:arr)
        {
            if(ele>cur)
            {
                cur=ele;
            }
        }
        return cur;
    }
}
