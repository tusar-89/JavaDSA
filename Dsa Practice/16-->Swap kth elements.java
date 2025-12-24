Problem--> 

  Given an array arr[], swap the kth element from the beginning with the kth element from the end.

Note: 1-based indexing is followed.

https://www.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=2&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions
Ans-->

  class Solution{
    public void swapKth(List<Integer>arr,int k){
      int n=arr.size();
      int left=k-1;
      int right=n-k;
      int temp=arr.get(left);
      arr.set(left,arr.get(right));
      arr.set(right,temp);
      
    }
}
