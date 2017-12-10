/*
Check a string has valid parenthesis or not.
Algo:
1. put all open parenthesis in a hashmap <key, value> = <open parenthesis,close parenthesis>

2.now check each character using for loop if it blongs to keyset of hashmap then push into a stack 
3.if character is belongs to values of hashmap and stack is not empty then pop from stack else return false

4. after the foor loop check stack is empty or not, if stack is empty then string has valid parenthesis.

 

*/


import java.io.*;
import java.util.*;

public class ValidParenthesis{

public static void main(String[] args) {
	
	System.out.println("Enter String of parenthesis");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	System.out.println(isValidParenthesis(input));
	
}//main

public static boolean isValidParenthesis(String str) {
	
	
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < str.length(); i++) 
	{
		char curr = str.charAt(i);
 
		if (map.keySet().contains(curr)) 
		{
			stack.push(curr);
		} else if (map.values().contains(curr)) 
		{
			if (!stack.empty() && map.get(stack.peek()) == curr) 
			{
				stack.pop();
			} else {
				return false;
			}
		}
	}//for
 
	return stack.empty(); // stack should be empty for valid parenthesis.
}//method

}// class