/*
290. Word Pattern
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.


*/
import java.util.*;

class WordPattern {
	
	
    public static boolean wordPattern(String pattern, String str) {
		
	String[] arr = str.split(" ");  
    //prevent out of boundary problem
    if(arr.length != pattern.length())
        return false;

    HashMap<Character, String> map = new HashMap<Character, String>();

	//pattern = "abba", str = "dog cat cat dog" 
    for(int i=0; i<pattern.length(); i++)
	{
        char c = pattern.charAt(i);
        if(map.containsKey(c))
		{
            String value = map.get(c);
            if(!value.equals(arr[i])){
                return false;
            }
        }
		if (map.containsValue(arr[i]))
		{
            return false;
        }
        map.put(c, arr[i]);
    }//for
 
    return true;
        
    }
	
	public static void main(String[] args)
	{
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
}