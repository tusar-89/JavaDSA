Problem--> 

You are given a binary array arr[], where each element is either 0 or 1.
Your task is to rearrange the array in increasing order in place (without using extra space).
You do not need to return anything; simply modify the input array.

https://www.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1?page=1&category=Arrays&difficulty=Basic&status=solved,unsolved&sortBy=submissions

Ans-->

   public void binSort(int[] arr) {
        // code here 
         int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer forward if the current element is 0
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer backward if the current element is 1
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // If left is less than right, swap the elements
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
        
}   
    
