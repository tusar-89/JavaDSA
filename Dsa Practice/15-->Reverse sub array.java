Problem-->
Given an array arr, you need to reverse a subarray of that array.
The range of this subarray is given by indices l and r (1-based indexing).

https://www.geeksforgeeks.org/problems/reverse-sub-array5620/1?page=3&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions
Ans-->

  class Solution {
   public static Arraylist<Integer>reverseSubArray(ArrayList<Integer>arr,int l,int r){
     int left=l-1;
     int right=r-1;
     while(left<right)
       {
         int temp=arr.get(left);
         arr.set(left,arr.get(right));
         arr.set(right,temp);
         //Collections.swap(arr,left,right);
         left++;
         right--;
       }
     return arr;
   }
}
