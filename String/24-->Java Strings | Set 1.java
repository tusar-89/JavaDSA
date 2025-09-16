/*
Problem--> 

Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.

https://www.geeksforgeeks.org/problems/java-strings-set-15112/1?page=1&category=Strings&difficulty=Basic&status=unsolved&sortBy=submissions

Ans-->
  */
class Solution {
    static String conRevstr(String S1, String S2) {
        // store the resulting string in final_S
        String final_S = new String();
        String concat_S = new String();
        concat_S = S1 + S2;
        for (int i = concat_S.length() - 1; i >= 0; i--){
            final_S += concat_S.charAt(i);
        }
        // final resulting string
        return final_S;
    }
}
