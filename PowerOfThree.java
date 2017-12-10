/*
Power of Three
Given an integer, write a function to determine if it is a power of three.
*/

class PowerOfThree{
    //main
	public static void main(String[] args)
	{
		System.out.println(isPowerOfThree(15));
		System.out.println(isPowerOfThree2(15));
	}
	
	//method1
	public static boolean isPowerOfThree(int n) 
	{
        if(n==1)
		{
			return true;
		}
		boolean result = false;
		
		while(n>0)
		{
			int m = n%3;
			if(m==0)
			{
				n=n/3;
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
	public static boolean isPowerOfThree2(int n)
	{
		 if(n==0) 
        return false;
 
    if(n==1) 
        return true;
 
    if(n>1) 
        return n%3==0 && isPowerOfThree2(n/3);
    else
        return false;
	}
	
}//class