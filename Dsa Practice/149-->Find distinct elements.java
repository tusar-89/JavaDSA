Problem-->

Given an array arr[]. Your task is to return the count of all the distinct elements in an array

https://www.geeksforgeeks.org/batch/java-foundation-2/track/Java-Foundation-Array-2/problem/find-distinct-elements-1614078205

Solution -->

class Solution {
    static int distinct(int arr[], int n) {
        // code here
        int i,j,ans=0;
        for(i=0;i<n;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                break;
            }
            if(j==-1)
            {
                ans++;
            }
        }
        return ans;
    }
}
