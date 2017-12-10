/*
342. Power of Four
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

*/

class PowerOfFour{
    //main
	public static void main(String[] args)
	{
		System.out.println(isPowerOfFour(20));
		System.out.println(isPowerOfFour2(20));
	}
	
	//method1
	public static boolean isPowerOfFour(int n) 
	{
        if(n==1)
		{
			return true;
		}
		boolean result = false;
		
		while(n>0)
		{
			int m = n%4;
			if(m==0)
			{
				n=n/4;
				if(n==1)
				{
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		return result;
		
    }//method
	
	//using recursion
	public static boolean isPowerOfFour2(int n)
	{
		 if(n==0) 
        return false;
 
    if(n==1) 
        return true;
 
    if(n>1) 
        return n%4==0 && isPowerOfFour2(n/4);
    else
        return false;
	}
	
}//class