<PROBLEM><=>  

https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735     

<ANS><=> 
 
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length<2)
        {
            return-1;
        }
       int firstlargest = 0;
       int secondlargest = 0;
            for(int num:arr)
            {
                if(num>firstlargest){
                secondlargest=firstlargest;
                firstlargest=num;
                }
                else if(num>secondlargest && num!=firstlargest)
                {
                    secondlargest=num;
                }
                
            }
            if(secondlargest==0)
            {
                return-1;
            }
            else{
                return secondlargest;
            }
    }
}


