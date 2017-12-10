import java.util.*;

public class HappyNumber{
	
	public static void main(String[] args){
		System.out.println(isHappy(4));
		
	}//main
	
	public static boolean isHappy(int n){
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(!set.contains(n))
		{
			set.add(n);
			n=getDigitSquareSum(n);
			
			if(n==1)
				return true;
		}//while
		return false;
	}//method
	
	public static int getDigitSquareSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+(n%10)*(n%10);
			n=n/10;
		}
		return sum;
	}
	
	
	
}//class