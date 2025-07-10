/*
Problem-->

Given an array arr[] of positive integers. Your task is to sort them so that 
the first part of the array contains odd numbers sorted in descending order, 
and the rest of the portion contains even numbers sorted in ascending order.

https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1?page=4&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions

Ans-->
 */

class Solution {

    public void sortIt(Long arr[]) {
        // code here.
        List<Long>odd=new ArrayList<>();
        List<Long>even=new ArrayList<>();
        for(long num:arr)
        {
            if(num%2==0)
            {
                even.add(num);
                
            }
            else
            {
                odd.add(num);
            }
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        int index=0;
        for(long num:odd)
        {
            arr[index++]=num;
        }
        for(long num:even)
        {
            arr[index++]=num;
        }
    }
}
