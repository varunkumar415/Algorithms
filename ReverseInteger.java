/*
7)
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

my question - how to reverse long range integer

*/

import java.util.*;

public class ReverseInteger{
	
	public static int reverse(int x) {
       
	   int reversed =0;
	   while(x!=0)
	   {
		   int temp = reversed*10+x%10; //0*10+3
		   // it will check range condition -- int range = -2^31 ~ 2^31-1
		   if(temp/10!=reversed)
		   {
			   return 0;
		   }
		   
		   reversed=temp; //3
		   x=x/10; // 123/10 = 12
	   }//while
	   return reversed; 
    }
	
	public static void main(String[] args){
		
		//System.out.println("Reverse Integer");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer value");
		int x= sc.nextInt(); //1000000003
		int output = reverse(x);
		System.out.println(output);
	}
	
}



