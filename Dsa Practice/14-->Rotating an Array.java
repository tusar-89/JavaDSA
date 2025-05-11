problem-->
  Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.

    https://www.geeksforgeeks.org/problems/reversal-algorithm5340/1?page=1&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions
Ans-->

  class solution
  {
    void leftRotate(int arr[],int d)
      {
         int n=arr.length;
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
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
    
