/*
FirstUniqueCharInString
387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.


*/
import java.util.*;

class FirstUniqueCharInString {
	
	public static void main(String[] args)
	{
		System.out.println(firstUniqChar("loveleetcode"));
	}
	
	
    public static int firstUniqChar(String word) 
	{
		HashMap<Character,Integer> scoreboard = new HashMap<>(); 
		// build table [char -> count] 
		for (int i = 0; i < word.length(); i++) 
		{ 
			char c = word.charAt(i); 
			if (scoreboard.containsKey(c)) 
			{ 
				scoreboard.put(c, scoreboard.get(c) + 1); 
			} 
			else 
			{ 
				scoreboard.put(c, 1); 
			} 
		} 
	// since HashMap doesn't maintain order, going through string again 
		for (int i = 0; i < word.length(); i++) 
		{ 
			char c = word.charAt(i); 
			if (scoreboard.get(c) == 1) 
			{ return i; 
			} 
		}
		return -1;   
    }//method
}