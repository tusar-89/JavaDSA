/* 
Problem-->

Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

https://www.geeksforgeeks.org/problems/repeated-character2058/1?page=3&category=Strings&status=unsolved&sortBy=submissions

Ans-->

  */


class Solution{
    char firstRep(String s)
    {
        int hash[] = new int[26];
    
        for (int i = 0; i < s.length(); ++i)
            hash[s.charAt(i) - 'a']++;
    
        // we traverse the string from start and return the 
        // first character with frequency greater than 1.
        for (int i = 0; i < s.length (); ++i)
        {
            if (hash[s.charAt(i) - 'a'] > 1) return s.charAt(i);
        }
    
        // if we reach here, it means that no character repeats
        return '#';
    }
}
