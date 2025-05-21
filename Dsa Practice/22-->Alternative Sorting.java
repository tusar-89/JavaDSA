Problem-->

Given an array arr of distinct integers.
Rearrange the array in such a way that the first element is the largest and the second element is the smallest,
the third element is the second largest and the fourth element is the second smallest, 
and so on. 

  https://www.geeksforgeeks.org/problems/alternative-sorting1311/1?page=3&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions

Ans-->

  class Solution 
  {
     public static ArrayList<Integer> alternateSort(int[]arr)
    {
       Arrays.sort(arr);
       ArrayList<Integer> result=new Arraylist<>();
       int start=0;
       int end=arr.length-1;
      while(start<=end)
 
        {
           if(start!=end)
                { 
                  result.add(arr[end--]);
                  result.add(arr[start++]);
               }
         else
 
 
           {
               //arr.add(arr[start++]);
               arr.add(arr[end--]);

               }     

         }
            return result;
         }
      }
         




              




