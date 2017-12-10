/*
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, 
"pwke" is a subsequence and not a substring.
*/


import java.io.*;
import java.util.*;
import java.lang.*;


public class LogestSubstringWithoutRepeatingCharaters{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr String");
		String input = sc.nextLine();
		int substringLen = longestSubstring2(input);
		System.out.println("longest substring without repeating character: "+substringLen);
		
	}
	
	//method 1 - it will print longest subsequence with uniq char
	public static int longestSubstring(String inputstr){
		
		int maximumLen=0, i=0;
		boolean[] boolearn_arr = new boolean[256];
		for(int j=0;j<inputstr.length();j++)
		{
			while(boolearn_arr[inputstr.charAt(j)])
			{
				boolearn_arr[inputstr.charAt(j)] = false;
				i++;
			}
			boolearn_arr[inputstr.charAt(j)] = true;
			maximumLen = Math.max(maximumLen,j-i+1);
		}
		
	
		return maximumLen;
		
	}
	
	//method 2 - it will pass all TCs - longest substring with unique char
	public static int longestSubstring2(String s){
		
		 int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
    
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
				j++;
            } else {
                set.remove(s.charAt(i));
				i++;
            }
        }
    
        return max;
		
	}
	
	
	
	
}