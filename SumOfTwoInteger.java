/*

371. Sum of Two Integers
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.

*/

class SumOfTwoInteger {
	 
	public static void main(String[] args)
	{
		System.out.println(getSum(1,2));
		System.out.println(getSum2(1,2));
	}
	
    public static int getSum(int a, int b) 
	{
		while (b != 0)
		{
			// carry now contains common set bits of x and y
			int carry = a & b;  
	 
			// Sum of bits of x and y where at least one of the bits is not set
			a = a ^ b; 
	 
			// Carry is shifted by one so that adding it to x gives the required sum
			b = carry << 1;
		}
		return a;
        
    }//method
	
	 public static int getSum2(int a, int b) 
	 {
		if (b == 0)
			return a;
		else
			return getSum2( a ^ b, (a & b) << 1);
	 }
	
	
}//class