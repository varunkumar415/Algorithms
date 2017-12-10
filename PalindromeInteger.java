/*
9)
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?


*/

import java.util.*;

public class PalindromeInteger{
	
	public static boolean isPalindrome(int x) {
       
	    if(x<0 || x!=0 && x%10==0)
		{
			return false;
		}
	   
	   int reversed =0;
	   int original = x;
	   
	   while(x!=0)
	   {
		   int temp = reversed*10+x%10; //0*10+3
		   // it will check range condition -- int range = -2^31 ~ 2^31-1 but here it never be used
		   if(temp/10!=reversed)
		   {
			   return false;
		   }
		   reversed=temp; //3
		   x=x/10; // 123/10 = 12
	   }//while
	   return reversed==original; 
    }
	
	public static void main(String[] args){
		
		System.out.println("Palindrome Integer");
		//Scanner sc = new Scanner(System.in);
		int x=1221; //1000000003
		boolean output = isPalindrome(x);
		System.out.println(output);
	}
	
}



