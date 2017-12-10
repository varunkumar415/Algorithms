/*
231. Power of Two
Given an integer, write a function to determine if it is a power of two.

*/

class PowerOfTwo {
	
	public static void main(String[] args)
	{
		System.out.println(isPowerOfTwo(10));
	}
    
	public static boolean isPowerOfTwo(int n) 
	{
        //write your code here
		if(n==0)
			return true;
		if(n<0)
			return false;
		if((n&(n-1))==0) // main condition 
			return true;
		else 
			return false;
		
    }
}