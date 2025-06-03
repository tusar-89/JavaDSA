/* Problem-->

  Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits).
    The digits are stored such that the most significant digit is first element of array.

    https://www.geeksforgeeks.org/problems/plus-one/1?page=3&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
*/

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        int n=arr.size();
        ArrayList<Integer> ans=new ArrayList<>();
        boolean flag=false;
        
         for(int i=n-1;i>=0;i--)
         {
             int d=arr.get(i);
             if(flag == true)
             {
                 ans.add(0,d);
             }
             else if(d==9)
             {
                 ans.add(0,0);
             }
             else
             
             {
                 ans.add(0,d+1);
                 flag = true;
             }
         }
         if(flag == false)
         {
             ans.add(0,1);
         }
         return ans;
    }
}
