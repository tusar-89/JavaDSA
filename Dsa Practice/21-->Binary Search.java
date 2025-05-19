Problem--> 
  
  Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index.
    
https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&category=Arrays&difficulty=Easy&status=solved,unsolved&sortBy=submissions
    
Ans-->

  class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
      int low=0;
      int high=arr.length-1;
      int result =-1;
      while(low<=high)
        {
          int mid=low+(high-low);
          if(arr[mid]=k)
          {
            result=mid;
            high=mid-1;
          } 
          else if(arr[mid]<k)
        {
          low=mid+1;
        }
        else
            {
              high=mid-1;
            }
        }
      return result;
             }
        }
